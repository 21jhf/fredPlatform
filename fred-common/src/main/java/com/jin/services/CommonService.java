/** 
 * 文件名：  CommonService.java
 * @author  金洪飞
 * @最后修改人： 金洪飞 
 * @最后修改日期：	2017年2月27日 下午2:01:13
 * @version:1.0
 * Copyright 烽火通信股份有限公司 Corporation 2017
 */

package com.jin.services;

import java.util.List;

import com.jin.beans.SysMenu;

/**
 * 类描述：
 * 
 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:01:13
 * @version 0.1
 */

public interface CommonService extends BaseService {
	/**
	 * 
	 * getAllSystemMenuList 方法描述：获取所有系统菜单列表
	 * 
	 * @author 金洪飞 @最后修改人： 金洪飞 @最后修改日期： 2017年2月27日 下午2:04:00
	 * @version 0.1
	 *
	 * @return
	 * @throws Exception
	 * @return List<SysMenu>
	 */
	public List<SysMenu> getAllSystemMenuList() throws Exception;
}
