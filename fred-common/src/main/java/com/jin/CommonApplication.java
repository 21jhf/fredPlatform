package com.jin;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.github.pagehelper.PageInterceptor;

/**
 * Created by FredJin on 2017/2/17.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableCaching
@MapperScan("com.jin.*")
public class CommonApplication {

	@Bean
	HttpMessageConverters httpMessageConverters() {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		converter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> httpMessageConverter = converter;
		return new HttpMessageConverters(httpMessageConverter);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// 分页插件
		Properties properties = new Properties();
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		// 添加插件
		PageInterceptor pageInterceptor = new PageInterceptor();
		pageInterceptor.setProperties(properties);
		sqlSessionFactoryBean.setPlugins(new Interceptor[] { pageInterceptor });

		// 指定mybatisxml文件路径
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	public static void main(String[] args) {
		SpringApplication.run(CommonApplication.class, args);
	}
}