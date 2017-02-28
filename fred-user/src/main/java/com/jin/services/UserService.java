/** 
 * 文件名：  UserService.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午2:59:56
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.services;

import java.util.List;

import com.jin.beans.SysUser;

/**
 * 类描述：用户服务接口
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:59:56
 * @version 0.1
 */

public interface UserService {
	public SysUser login(String userId, String password) throws Exception;

	public List<SysUser> getUserList() throws Exception;

	public SysUser getUserInfoByUserId(String userId) throws Exception;
}
