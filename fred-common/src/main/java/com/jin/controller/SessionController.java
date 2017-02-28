package com.jin.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jin.com.jin.beans.User;
import com.jin.services.impl.SessionServiceImpl;

/**
 * @Author 金洪飞
 * @Date 2017/2/17 17:36
 *
 */
@RestController
public class SessionController {
	@Autowired
	SessionServiceImpl sessionService;

	@RequestMapping("/getUserInfo")
	public User getUserInfo() throws Exception {
		User user = new User();
		user.setId(1);
		user.setUserName("张三");
		user.setRemark("remark6");
		user.setCreateAt(new Date());
		return user;
	}

}
