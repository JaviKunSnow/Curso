package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class TestController {

	//ENTRARA POR ESTA PETICION SI NO HAY UN INDEX, O SI LO HAY, SI CONFIGURAMOS ESTA RUTA COMO PUNTO DE ENTRADA, SIMILAR A <welcome-file> del XML
	@ResponseBody
	@RequestMapping("")
	public String home() {
		return "Hola, el despachador me ha redirigido a la home";
	}
	
	
	@ResponseBody
	@RequestMapping(path="/test", method = RequestMethod.GET)
	public String test() {
		return "Hola, funcionamos de forma correcta";
		
	}

	

	@RequestMapping(path="/saludar", method = RequestMethod.GET)	
	public String saludar(Model model, HttpServletRequest request) {	
		
		model.addAttribute("attributo", request.getParameter("campo1"));
		
		
		
		return "hola";
		
	}

	
}
