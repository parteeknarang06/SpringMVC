package com.controller.bindingParams;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamBindingController {
	
	@RequestMapping("/show3")
	public String showParamBinding() {
		return "/parambinding/input";
	}
	
	@RequestMapping("/process3")
	public String getParamBinding(@RequestParam("ename")String empName,@RequestParam("ecode")String empCode, Model model) {
		EmployeeBean bean=new EmployeeBean();
		bean.setEcode("E-"+empCode.toUpperCase());
		bean.setEname("N-"+empName.toUpperCase());
		model.addAttribute("employeeBean", bean);
		return "/parambinding/process";
	}
}
