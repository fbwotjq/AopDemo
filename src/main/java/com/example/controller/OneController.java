package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OneController {

	@RequestMapping(value="/one_one")
	@ResponseBody public Map<String, Object> one_one() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "one");
		map.put("name", "one");
		return map;
	}
	
	@RequestMapping(value="/one_two")
	@ResponseBody public Map<String, Object> one_two() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "one");
		map.put("name", "two");
		return map;
	}
	
}
