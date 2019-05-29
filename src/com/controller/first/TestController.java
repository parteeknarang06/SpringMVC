package com.controller.first;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	private static Logger logger=LogManager.getLogger(TestController.class);
	
	@RequestMapping("/test")
	public String getTestPage() {
		logger.info("logger is working getTestPage");
		return "/first/testPage";
	}
}
