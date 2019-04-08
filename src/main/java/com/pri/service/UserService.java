package com.pri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pri.dao.UserMapper;
import com.pri.entity.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;


	/**
	 * Method name: findUserList <BR>
	 * Description: findUserList <BR>
	 * Remark: <BR>
	 * @param page
	 * @param size
	 * @return  PageInfo<User><BR>
	 * @author )Mine+
	 */
	public PageInfo<User> findUserList(int page, int size) {
		// 开启分页插件,放在查询语句上面
		PageHelper.startPage(page, size);
		List<User> listUser = userMapper.findUserList();
		listUser.forEach(u -> System.out.println(u.toString()));
		// 封装分页之后的数据
		PageInfo<User> pageInfoUser = new PageInfo<User>(listUser);
		return pageInfoUser;
	}
	
	@Transactional
	public int addUser(String name, Integer age,int i){
		int r = userMapper.addUser(name, age);
		System.out.println("r:"+r);
		int t = 1/i;
		return r;
	}
	

}
