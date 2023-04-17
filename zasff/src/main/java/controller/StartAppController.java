package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartAppController {

	public StartAppController() {
		System.out.println("llamamos al starApp Constructor");
	}
	
	@RequestMapping("")
	public String startApp()
	{
		System.out.println("llamamos al metodo starApp");
		return "index";
	}
	
	
}
