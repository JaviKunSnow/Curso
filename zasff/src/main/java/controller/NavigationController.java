package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import model.DTO.UsuarioDTO;

@Controller
public class NavigationController {

	public NavigationController() {
		System.out.println("llamamos al NavigationController Constructor");
	}
	
	
	@GetMapping("/goLogin")
	public String goLogin()
	{
		return "login";
	}
	
	@GetMapping("/goRegister")
	public String goRegister(@ModelAttribute("userRegister") UsuarioDTO usuario)
	{
		return "/tienda/register";
	}
	
}
