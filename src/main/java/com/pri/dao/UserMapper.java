package com.pri.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pri.entity.User;

public interface UserMapper {
	
	@Select("SELECT * FROM users ")
	List<User> findUserList();
	
	@Insert("insert into users values(null,#{name},#{age});")
	public int addUser(@Param("name") String name, @Param("age") Integer age);



}
