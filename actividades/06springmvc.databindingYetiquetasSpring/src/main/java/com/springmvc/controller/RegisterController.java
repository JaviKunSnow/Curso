package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.api.UserRegisterDTO;

@Controller
public class RegisterController {

		
	@RequestMapping("/register")
	//CUANDO UTILIZAMOS @ModelAttribute lo que estamos indicando es que tenemos un objeto de un tipo concreto dentro del objeto Modelo
	public String registrar(@ModelAttribute("userRegister") UserRegisterDTO user) {
		
		System.out.println("llegamos al registro");
		
		return "registro";
	}

    @RequestMapping("/process-register")   
	public String procesarRegistro(@ModelAttribute("userRegister") UserRegisterDTO user) {
		
    	System.out.println("Vamos a registrar");		

		return "resultado-registro";
	}

}
