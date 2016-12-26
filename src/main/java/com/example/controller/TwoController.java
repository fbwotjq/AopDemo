package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TwoController {

	@RequestMapping(value="/two_one")
	@ResponseBody public Map<String, Object> two_one() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "two");
		map.put("name", "one");
		return map;
	}
	
	@RequestMapping(value="/two_two")
	@ResponseBody public Map<String, Object> two_two() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "two");
		map.put("name", "two");
		return map;
	}
	
}
