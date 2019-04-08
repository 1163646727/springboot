package com.pri.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * class name:GlobalExceptionHandler <BR>
 * class description: 全局捕获异常 <BR>
 * Remark: <BR>
 * @version 1.00 2019年3月28日
 * @author **)ChenQi
 */
//@ControllerAdvice(basePackages = "com.pri")
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> errorResult(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("errorCode", "500");
		map.put("errorMsg", "系统错误！");
		
		return map;
	}

}
