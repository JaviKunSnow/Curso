package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorDos {
	
	    //ANOTACION PARA MAPEAR LA PETICION
		@RequestMapping("/dos")
		//ANOTACION PARA INDICAR QUE LA RESPUETA LA ENVIAMOS EN EL BODY (TEXTO EN EL OBJETO RESPONSE DE LA PETICION)
		@ResponseBody
		public String saludar() {
			
			return "Hola, soy el controlador 2";
		}
		
		
		
		
}
