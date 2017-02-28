/** 
 * 文件名：  UserController.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月21日 上午9:27:27
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.pagehelper.PageHelper;
import com.jin.beans.SysMenu;
import com.jin.beans.SysUser;
import com.jin.client.feign.InvokeCommonFeign;
import com.jin.services.impl.UserServiceImpl;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月21日 上午9:27:27
 * @version 0.1
 */
@RestController
public class UserController {
	@Autowired
	UserServiceImpl userService;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	InvokeCommonFeign invokeCommonFeign;

	/**
	 * 调用common模块接口方法 invokeCommon 方法描述：调用其他微服务两种方式，1，RestTemplate，2，用cloud
	 * Feign
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月21日 上午10:01:11
	 * @version 0.1
	 *
	 * @param userId
	 * @return
	 * @return List<SysUser>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping("/getUserList/{userId}")
	public List<SysUser> invokeCommon(@PathVariable("userId") String userId) {
		List<SysUser> userList = this.restTemplate.getForObject("http://fredCommon/getUserList?userId={userId}",
				ArrayList.class, userId);
		return userList;
	}

	/**
	 * 
	 * login 方法描述：登录验证
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:58:30
	 * @version 0.1
	 *
	 * @param userId
	 * @param password
	 * @return
	 * @return SysUser
	 */
	@PostMapping("/login")
	public SysUser login(String userId, String password) throws Exception {
		return userService.login(userId, password);
	}

	@GetMapping("/getUserInfoByUserId")
	public SysUser getUserList(@RequestParam("userId") String userId) throws Exception {
		PageHelper.startPage(1, 10);
		return userService.getUserInfoByUserId(userId);
	}

	@RequestMapping("/getAllUserList")
	public List<SysUser> getUserIdList() throws Exception {
		PageHelper.startPage(1, 10);
		return userService.getUserList();
	}

	@GetMapping("/getAllMenu")
	public List<SysMenu> getAllMenu() throws Exception {
		return invokeCommonFeign.getAllSystemMenuList();
	}
}
