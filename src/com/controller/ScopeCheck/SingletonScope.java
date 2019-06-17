package com.controller.ScopeCheck;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
@RequestMapping("/singletonScope")
public class SingletonScope {
	
	@RequestMapping("/addScope")
	public void setValue() {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		EmployeeBean bean = context.getBean(EmployeeBean.class, "empBean");
		bean.setEcode("DG00224");
		bean.setEname("narang");
		System.out.println("value set by:"+getSessionId());
		EmployeeBean bean1 = context.getBean(EmployeeBean.class, "empBean");
		System.out.println("value get by:"+getSessionId());
		System.out.println(bean1.getEcode());
		System.out.println(bean1.getEname());
		context.close();
	}
	
	@RequestMapping("/checkScope")
	public void getValue() {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		EmployeeBean bean = context.getBean(EmployeeBean.class, "empBean");
		System.out.println("value get by:"+getSessionId());
		System.out.println(bean.getEcode());
		System.out.println(bean.getEname());
		context.close();
	}
	
	private String getSessionId() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		return attr.getSessionId();
	}
}
