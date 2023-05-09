package curso.java.tienda.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UsuarioController {

	@GetMapping("")
	public String goIndex() {
		
		return "index";
	}
	
}
