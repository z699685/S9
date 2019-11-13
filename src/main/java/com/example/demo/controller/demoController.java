package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.mapper.DemoMapper;

@Controller
public class demoController {
	@Autowired
	DemoMapper demoMapper;
	
	@GetMapping("/")
	public String index(Model model,@RequestParam(defaultValue = "0",name="id")Integer id) {
		model.addAttribute("list", demoMapper.getMatch());
		model.addAttribute("result", demoMapper.getResult(id));
		return "index";

	}

}
