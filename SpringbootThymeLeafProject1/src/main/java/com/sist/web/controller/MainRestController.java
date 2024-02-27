package com.sist.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class MainRestController {
	@GetMapping("/food")
	public Map food_list() throws Exception{
		Map map = new HashMap();
		map.put("name", "홍길동");
		map.put("sex", "남자");
		return map;
	}
}
