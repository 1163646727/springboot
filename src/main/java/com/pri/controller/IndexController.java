package com.pri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.pri.entity.User;
import com.pri.service.UserService;

@RestController
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findUserList")
	public PageInfo<User> findUserList(int page, int size) {
		return userService.findUserList(page, size);
	}
	
	/**
	 * Method name: addUser <BR>
	 * Description: 添加用户 <BR>
	 * Remark: <BR>
	 * @param name
	 * @param age
	 * @param i  void<BR>
	 * @author )Mine+
	 */
	@RequestMapping("/addUser")
	public String addUser(String name, Integer age,int i){
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("i:"+i);
		int r = userService.addUser(name, age, i);
		System.out.println("结果："+r);
		return "操作结果："+r;
	}
	
	@RequestMapping("/zero")
	public void zee(){
		int i =  7/0;
	}
	
	@RequestMapping("/index2")
	public String index2(){
		//int i =  7/0;
		return "index2";
	}

}
