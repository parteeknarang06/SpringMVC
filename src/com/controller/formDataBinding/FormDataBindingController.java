package com.controller.formDataBinding;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.controller.bindingParams.EmployeeBean;

@Controller
@RequestMapping("/formDataBindcontroller")
public class FormDataBindingController {
	@Value("#{countryOptions}")
	private Map<String,String> countriesList;
	@Value("#{sports}")
	private Map<String,String> email;
	
	@RequestMapping("/showPage")
	public String getPage(Model model) {
		EmployeeBean bean= new EmployeeBean();
		bean.setController("DF-");
		bean.setCountry("USA");
		model.addAttribute("empbean", bean);
		model.addAttribute("countriesList", countriesList);
		model.addAttribute("email", email);
		return "/formDataBinding/show";
	}
	
	@RequestMapping("/process")
	public String getProcess(@ModelAttribute("empbean")EmployeeBean bean) {
		bean.setEname(bean.getEname().toUpperCase());
		return "/formDataBinding/process";
	}
}
