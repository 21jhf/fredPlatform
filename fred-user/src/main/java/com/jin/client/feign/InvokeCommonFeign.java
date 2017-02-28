/** 
 * 文件名：  InvokeCommonFeign.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午4:15:30
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.client.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jin.beans.SysMenu;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午4:15:30
 * @version 0.1
 */
@FeignClient("fred-common")
public interface InvokeCommonFeign {
	@RequestMapping(value = "/getAllSystemMenuList")
	public List<SysMenu> getAllSystemMenuList() throws Exception;
}
