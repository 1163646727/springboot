package com.pri.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * class name:FreeMarkIndexController <BR>
 * class description: 整合freeMark,调整页面 <BR>
 * Remark: <BR>
 * @version 1.00 2019年3月28日
 * @author **)ChenQi
 */
public class FreeMarkIndexController {
	
	
	/**
	 * Method name: toFtlIndex <BR>
	 * Description: 跳转ftlIndex.ftl页面 <BR>
	 * Remark: <BR>
	 * @param map
	 * @return  String<BR>
	 * @author **)ChenQi
	 */
	@RequestMapping("/ftlIndex")
	public String toFtlIndex(Map<String, Object> map){
		map.put("name", "陈齐");
		map.put("sex", "男");
		map.put("age", 28);
		return "ftlIndex";
	}

}
