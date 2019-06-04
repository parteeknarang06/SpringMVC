package com.controller.hibernateValidation;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hibernateValidation")
public class HibernateFormValidation {

	@RequestMapping("/showPage")
	public String getForm(Model model) {
		Customer cos = new Customer();
		cos.setLastName("narang");
		model.addAttribute("customer", cos);
		return "/hibernateFormValidation/input";
	}
	
	@RequestMapping("/process")
	public String processForm(@Valid @ModelAttribute("customer")Customer modelCustomer,BindingResult theBindingResult) {
		System.out.println("First name|"+modelCustomer.getFirstName()+"|");
		if(theBindingResult.hasErrors()) 
			return "/hibernateFormValidation/input";
		return "/hibernateFormValidation/confirmation";
	}
	
	/**
	 * Trim the string from html
	 * */
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) { 
		/**
		 * For StringTrimmerEditor: values
		 * True- nullyfy the string if empty
		 * False-donot nullyfy the string if empty
		 * */
		StringTrimmerEditor trimmer=new StringTrimmerEditor(false);
		webDataBinder.registerCustomEditor(String.class, trimmer);
	}
}
