package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SampleController {
	@RequestMapping("/")
	public String doStart(Model model){
		model.addAttribute("msg","Spring Mvc Sprng");
		return "welcome";
	}
}
