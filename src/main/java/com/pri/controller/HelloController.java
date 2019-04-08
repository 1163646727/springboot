package com.pri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * class name:HelloController <BR>
 * class description: springboot整合jsp；测试项目启动情况 ，<BR>
 *                  Controller层只需要添加@Controller注解即可<BR>
 * Remark: <BR>
 * @version 1.00 2019年3月28日
 * @author **)ChenQi
 */
@Controller
public class HelloController {
	
    @RequestMapping("index")
    public String page(){
    	System.out.println("跳转index.html");
        return "index"; //fang
    }

}
