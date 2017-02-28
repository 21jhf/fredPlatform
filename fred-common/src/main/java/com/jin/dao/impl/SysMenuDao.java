/** 
 * 文件名：  SysMenuDao.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午2:10:55
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.dao.impl;

import java.util.List;

import com.jin.beans.SysMenu;
import com.jin.dao.SysMenuMapper;

/**
 * 类描述： 新加dao方法类
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:10:55
 * @version 0.1
 */

public interface SysMenuDao extends SysMenuMapper {
	/**
	 * 
	 * getAllSystemMenuList 方法描述：获取系统菜单所有列表数据
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:16:31
	 * @version 0.1
	 *
	 * @return
	 * @throws Exception
	 * @return List<SysMenu>
	 */
	public List<SysMenu> getAllSystemMenuList() throws Exception;
}
