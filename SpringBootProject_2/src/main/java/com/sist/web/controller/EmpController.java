package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.web.service.*;
import java.util.*;
import com.sist.web.vo.*;

@Controller
public class EmpController {
	@Autowired
	private EmpService eService;
	
	@GetMapping("/")
	public String empListData(Model model) {
		List<EmpVO> list = eService.empListData();
		model.addAttribute("list",list);
		return "main";
	}
}
