package com.springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.api.UserInfoDTO;
import com.springmvc.api.UserRegisterDTO;

@Controller
public class PruebaController {
	
	
	
	@RequestMapping("")
	public String saludo() {
		return "index";
	}
	
	@GetMapping("/goRegister")
	public String veRegistro(@ModelAttribute("userRegister") UserRegisterDTO user) {
		
		return "registro";
	}
	
	@GetMapping("/goLogin")
	public String veLogin(@ModelAttribute("userInfo") UserInfoDTO userInfo, BindingResult bindigin) {
		
		return "login";
	}
	
	@PostMapping("/calcular")
	public String calcular(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfo, BindingResult errores, Model model) {
		
		if (errores.hasErrors()) {
			System.out.println("errores en la vinculacion del DTO");

			// PROCESAMOS LA LISTA DE ERRORES
			List<ObjectError> allErrors = errores.getAllErrors();

			for (ObjectError objectError : allErrors) {
				System.out.println(objectError);

			}	
			//SI NO PASAMOS LA VALIDACION VAMOS A LA HOME
			return "login";
		} 
		
		return "resultado-calculo";
	}
	
	@PostMapping("/doRegister")
	public String registrarse(@ModelAttribute("userRegister") UserRegisterDTO user) {
		
		
		
		return "resultado-registro";
		
	}

}
