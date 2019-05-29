package com.controller.modelData;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelDataContainer {
	
	@RequestMapping("/process2")
	public String letShout(HttpServletRequest request,Model model) {
		String name=request.getParameter("userName");
		model.addAttribute("message", "Yo!"+name.toUpperCase());
		return "/modeldata/process";
	}
	
	@RequestMapping("/show2")
	public String getSpringModelForm() {
		return "/modeldata/input";
	}
	
}
