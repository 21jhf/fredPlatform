/** 
 * 文件名：  EurekaServerApp.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月20日 下午10:26:42
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月20日 下午10:26:42
 * @version 0.1
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {

	/**
	 * main 方法描述：
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月20日 下午10:26:42
	 * @version 0.1
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);

	}

}
