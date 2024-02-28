package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sist.web.controller","com.sist.web.service","com.sist.web.entity"})
public class SpringbootThymeLeafProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeLeafProject3Application.class, args);
	}

}
