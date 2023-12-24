package com.example.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages ={"com.example.javadb","com.example.javadb.entities"})
@EntityScan(basePackages={"com.example.javadb", "com.example.javadb.entities"})
@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}

}
