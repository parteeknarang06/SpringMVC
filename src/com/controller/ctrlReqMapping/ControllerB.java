package com.controller.ctrlReqMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.bindingParams.EmployeeBean;

@Controller
@RequestMapping("/ctrlB")
public class ControllerB {
	
	@RequestMapping("/index")
	public String getIndexPage() {
		return "/ctrlReqMapping/indexB";
	}
	
	@RequestMapping("/process")
	public String process(@RequestParam("ename")String ename,@RequestParam("controller")String controller,Model model) {
		EmployeeBean bean=new EmployeeBean();
		bean.setEname("E-"+ename.toUpperCase());
		bean.setController("C-"+controller.toUpperCase());
		model.addAttribute("Emp", bean);
		return "/ctrlReqMapping/processB";
	}
}
