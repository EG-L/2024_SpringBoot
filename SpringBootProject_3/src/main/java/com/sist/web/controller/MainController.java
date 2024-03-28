package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.dao.EmpDAO;
import com.sist.web.entity.Emp;

import java.util.*;

@Controller
public class MainController {
	@Autowired
	private EmpDAO dao;
	
	@GetMapping("/")
	public String getMethodName(Model model) {
		List<Emp> list = dao.findAll();
		
		model.addAttribute("list",list);
		return "main";
	}
	
}
