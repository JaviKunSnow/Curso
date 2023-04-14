package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.api.Telefono;
import com.springmvc.api.UserContactDTO;
import com.springmvc.api.UserRegisterDTO;

@Controller
public class RegisterController {

		
	@RequestMapping("/register")	
	public String registrar(@ModelAttribute("userRegister") UserRegisterDTO user) {
		
		return "registro";
	}

    @RequestMapping("/process-register")
    //EL NOMBRE EN LA ETIQUETA PUEDE SER CUALQUIERA PERO MEJOR SEGUIN CON EL MISMO
	public String procesarRegistro(@ModelAttribute("userRegister") UserRegisterDTO user) {
		
    	System.out.println("Vamos a registrar");		

		return "resultado-registro";
	}

}
