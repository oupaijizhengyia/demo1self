package com.example.demo1self;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.demo1.demo1self.dao")
@SpringBootApplication
public class Demo1selfApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1selfApplication.class, args);
	}
}
