/** 
 * 文件名：  UserServiceImpl.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午3:00:52
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.beans.SysUser;
import com.jin.dao.impl.SysUserDao;
import com.jin.services.UserService;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午3:00:52
 * @version 0.1
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	SysUserDao sysUserDao;

	@Override
	public SysUser login(String userId, String password) throws Exception {
		return sysUserDao.login(userId, password);
	}

	@Override
	public List<SysUser> getUserList() throws Exception {
		return sysUserDao.getAllUserList();
	}

	@Override
	public SysUser getUserInfoByUserId(String userId) throws Exception {
		return sysUserDao.getUserInfoByUserId(userId);
	}

}
