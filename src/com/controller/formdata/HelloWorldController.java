package com.controller.formdata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/show")
	public String getMainForm() {
		return "/formdata/input";
	}
	
	@RequestMapping("/process")
	public String getProcessForm() {
		return "/formdata/process";
	}
}
