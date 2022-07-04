package com.david.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.david.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(UserInfoDTO userInfoDTO, Model model) {
		
//		model.addAttribute("userName", userInfoDTO.getUserName());
//		model.addAttribute("crushName", userInfoDTO.getCrushName());
//		
//		System.out.println("user name is "+userInfoDTO.getUserName());
//		System.out.println("crush name is "+userInfoDTO.getCrushName());
//		
		model.addAttribute("userInfo", userInfoDTO);
		
		return "result-page";
	}
}
