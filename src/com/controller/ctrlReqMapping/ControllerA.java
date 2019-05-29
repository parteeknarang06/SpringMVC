package com.controller.ctrlReqMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctrlA")
public class ControllerA {
	
	@RequestMapping("/index")
	public String getIndexPage() {
		return "/ctrlReqMapping/indexA";
	}
	
	@RequestMapping("/process")
	public String process(@RequestParam("ename")String ename,@RequestParam("controller")String controller,Model model) {
		model.addAttribute("modelename","E-"+ename.toUpperCase());
		model.addAttribute("modelcontroller","C-"+controller.toUpperCase());
		return "/ctrlReqMapping/processA";
	}
}
