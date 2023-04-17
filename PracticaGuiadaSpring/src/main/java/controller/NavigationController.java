package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import model.DTO.UsuarioDTO;
import model.VO.UsuarioVO;


@Controller
public class NavigationController {

	public NavigationController() {
		System.out.println("llamamos al NavigationController Constructor");
	}
	
	
	@GetMapping("/goLogin")
	public String goLogin(@ModelAttribute("userLogin") UsuarioDTO usuario, Model model)
	{
		return "login";
	}
	
	@GetMapping("/goRegister")
	public String goRegister(@ModelAttribute("userRegister") UsuarioDTO usuario)
	{
		return "/tienda/register";
	}
}
