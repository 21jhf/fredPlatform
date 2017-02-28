package com.jin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/2/18.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableCaching
@MapperScan("com.jin.*")
@EnableFeignClients
public class FredUserApplication {
	/**
	 * 
	 * restTemplate 方法描述：组件调用接口，使用负载均衡
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月21日 上午10:18:04
	 * @version 0.1
	 *
	 * @return
	 * @return RestTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(FredUserApplication.class, args);
	}
}
