/** 
 * 文件名：  SysUserDao.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午3:09:05
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

import com.jin.beans.SysUser;
import com.jin.dao.SysUserMapper;

/**
 * 类描述：系统用户数据访问对象
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午3:09:05
 * @version 0.1
 */

public interface SysUserDao extends SysUserMapper {

	public SysUser login(@Param("user_id") String userId, @Param("password") String password) throws Exception;

	@Cacheable("userInfo")
	public SysUser getUserInfoByUserId(String userId) throws Exception;

	/**
	 * 
	 * getAllUserList 方法描述：获取所有用户列表
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 上午11:45:01
	 * @version 0.1
	 *
	 * @return
	 * @return List<SysUser>
	 */
	@Cacheable("userList")
	List<SysUser> getAllUserList();
}
