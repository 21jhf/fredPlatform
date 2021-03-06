package com.jin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jin.stream.MockStreamServlet;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
@EnableHystrixDashboard
public class HystrixDashboardApp extends SpringBootServletInitializer {
	@RequestMapping("/")
	public String home() {
		return "forward:/hystrix";
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HystrixDashboardApp.class).web(true);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixDashboardApp.class).web(true).run(args);
	}

	@Bean
	public ServletRegistrationBean mockStreamServlet() {
		return new ServletRegistrationBean(new MockStreamServlet(), "/mock.stream");
	}

}
