/** 
 * 文件名：  CommonServiceImpl.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午2:06:14
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.beans.SysMenu;
import com.jin.dao.impl.SysMenuDao;
import com.jin.services.CommonService;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:06:14
 * @version 0.1
 */
@Service
public class CommonServiceImpl extends BaseServiceImpl implements CommonService {
	@Autowired
	private SysMenuDao sysMenuDao;
	/*
	 * @see com.jin.services.CommonService#getAllSystemMenuList()
	 */

	@Override
	public List<SysMenu> getAllSystemMenuList() throws Exception {
		return sysMenuDao.getAllSystemMenuList();
	}

}
