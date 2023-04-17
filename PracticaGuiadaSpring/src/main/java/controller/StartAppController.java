package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartAppController {
	
	
	public StartAppController() {
		System.out.println("entra en startapp");
	}
	
	@RequestMapping("")
	public String goIndex() {
		return "index";
	}
	
}
