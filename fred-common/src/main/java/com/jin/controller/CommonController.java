/** 
 * 文件名：  CommonController.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午1:58:16
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jin.beans.SysMenu;
import com.jin.services.impl.CommonServiceImpl;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午1:58:16
 * @version 0.1
 */
@RestController
public class CommonController {
	@Autowired
	CommonServiceImpl commonService;

	/**
	 * 
	 * getAllSystemMenuList 方法描述：获取所有系统菜单项目列表
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:08:18
	 * @version 0.1
	 *
	 * @return
	 * @throws Exception
	 * @return List<SysMenu>
	 */
	@GetMapping("/getAllSystemMenuList")
	public List<SysMenu> getAllSystemMenuList() throws Exception {
		return commonService.getAllSystemMenuList();
	}
}
