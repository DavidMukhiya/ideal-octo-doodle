package com.david.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@RequestParam String userName, @RequestParam String crushName, Model model) {
		
		model.addAttribute("userName", userName);
		model.addAttribute("crushName", crushName);
		
		System.out.println("user name is "+userName);
		System.out.println("crush name is "+crushName);
		
		
		return "result-page";
	}
}
