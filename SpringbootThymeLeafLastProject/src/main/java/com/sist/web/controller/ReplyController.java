package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sist.web.dao.ReplyDAO;
import com.sist.web.entity.Reply;

import jakarta.servlet.http.HttpSession;

@Controller
public class ReplyController {
	@Autowired
	private ReplyDAO dao;
	
	@PostMapping("/reply/insert")
	public String replyInsert(Reply vo,HttpSession session,RedirectAttributes ra) {
		ra.addAttribute("fno",vo.getFno());
		
		return "redirect:../food/detail";
	}
}
