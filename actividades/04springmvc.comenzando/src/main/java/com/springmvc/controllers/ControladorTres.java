package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tres") //Esto es lo que sería mapear a nivel de clase, y luego tendríamos los metodos como endpoints
//Mapeando el controlador podemos agrupar funcionalidades  por ruta
public class ControladorTres {
	
		
	   //ANOTACION PARA MAPEAR LA PETICION
		@RequestMapping("/prueba") //--> COLOCANDO EL PATRON DE ENTRADA CONSEGUIMOS QUE ESTE CONTROLADOR SEA EL PRIMERO QUE ES ATENDIDO POR EL DESPACHADOR O CADA VEZ QUE QUEREMOS IR A LA HOME, TENDREMOS LA RESPUESTA DE ESTE CONTROLADOR
		//ANOTACION PARA INDICAR QUE LA RESPUETA LA ENVIAMOS EN EL BODY (TEXTO EN EL OBJETO RESPONSE DE LA PETICION)
		@ResponseBody
		public String saludar() {
			
			return "Hola, soy el controlador que tiene un mapeo a nivel de clase";
		}
		
		
		//ANOTACION PARA MAPEAR LA PETICION
		@RequestMapping("/contestar") //--> COLOCANDO EL PATRON DE ENTRADA CONSEGUIMOS QUE ESTE CONTROLADOR SEA EL PRIMERO QUE ES ATENDIDO POR EL DESPACHADOR O CADA VEZ QUE QUEREMOS IR A LA HOME, TENDREMOS LA RESPUESTA DE ESTE CONTROLADOR
		//ANOTACION PARA INDICAR QUE LA RESPUETA LA ENVIAMOS EN EL BODY (TEXTO EN EL OBJETO RESPONSE DE LA PETICION)
		@ResponseBody
		public String contestar() {
				return "Hola, respueta desde el segundo metodo del controlador a nivel de clase";
		}
				
		
		

}
