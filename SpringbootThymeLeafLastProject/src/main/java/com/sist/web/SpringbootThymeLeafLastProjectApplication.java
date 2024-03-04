package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//<context:component-scan basepackage="com.sist.*">
@SpringBootApplication
@ComponentScan(basePackages = {"com.sist.web.controller"})
public class SpringbootThymeLeafLastProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeLeafLastProjectApplication.class, args);
	}

}
