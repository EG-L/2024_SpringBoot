package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.service.*;

@Controller
@RequestMapping("board/")
public class BoardController {
	@Autowired
	private BoardService bSerivce;
	
	@GetMapping("list")
	public String board_list(String page,Model model) {
		if(page==null)
			page="1";
		int curpage = Integer.parseInt(page);
		int rowSize = 10;
		int start = (rowSize*curpage)-(rowSize);
		List<BoardEntity> list = bSerivce.boardListData(start);
		int totalpage = bSerivce.boardTotalPage();
		
		for(BoardEntity vo:list) {
			String s = vo.getRegdate();
			String[] ss = s.split(" ");
			vo.setRegdate(ss[0].trim());
		}
		
		model.addAttribute("curpage",curpage);
		model.addAttribute("list",list);
		model.addAttribute("totalpage",totalpage);
		
		return "board/list";
	}
	
	@GetMapping("insert")
	public String board_insert() {
		return "board/insert";
	}
	
	@PostMapping("insert_ok")
	public String board_insert_ok(BoardEntity vo) {
		bSerivce.save(vo);
		return "redirect:../board/list";
	}
	
	@GetMapping("detail")
	public String board_detail(int no,Model model) {
		BoardEntity vo = bSerivce.findByNo(no);
		vo.setHit(vo.getHit()+1);
		bSerivce.save(vo);
		//조회수 증가
		vo = bSerivce.findByNo(no);
		model.addAttribute("vo",vo);
		
		return "board/detail";
	}
	
	@GetMapping("update")
	public String board_update(int no,Model model) {
		BoardEntity vo = bSerivce.findByNo(no);
		model.addAttribute("vo",vo);
		
		return "board/update";
	}
	
	@PostMapping("update_ok")
	@ResponseBody
	public String board_update_ok(BoardEntity vo) {
		
		String result="";
		BoardEntity en = bSerivce.findByNo(vo.getNo());
		if(en.getPwd().equals(vo.getPwd())) {
			result="<script>"
					+ "location.href=\"/board/detail?no="+vo.getNo()+"\""
							+ "</script>";
			bSerivce.save(vo);
		}
		else {
			result="<script>"
					+ "alert(\"Password Fail\");"
					+ "history.back();"
					+ "</script>";
		}
		return result;
	}
	
	@GetMapping("delete")
	public String board_delete(int no,Model model) {
		model.addAttribute("no",no);
		return "board/delete";
	}
	
	@PostMapping("delete_ok")
	@ResponseBody
	public String board_delete_ok(int no,String pwd) {
		String result = "";
		BoardEntity vo = bSerivce.findByNo(no);
		if(pwd.equals(vo.getPwd())) {
			result="<script>"
					+ "location.href=\"/board/list\""
					+ "</script>";
			bSerivce.delete(vo);
		}
		else {
			result="<script>"
					+ "alert(\"Password Fail\");"
					+ "history.back();"
					+ "</script>";
		}
		return result;
	}
}
