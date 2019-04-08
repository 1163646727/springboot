package com.pri;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * class name:App <BR>
 * class description: 项目启动入口 <BR>
 * Remark: <BR>
 * @version 1.00 2019年3月28日
 * @author **)ChenQi
 */
@SpringBootApplication
@MapperScan(basePackages = "com.pri.dao")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
