package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class ControladorUno {
	
		
	   //ANOTACION PARA MAPEAR LA PETICION
		@RequestMapping("/home") //--> COLOCANDO EL PATRON DE ENTRADA CONSEGUIMOS QUE ESTE CONTROLADOR SEA EL PRIMERO QUE ES ATENDIDO POR EL DESPACHADOR O CADA VEZ QUE QUEREMOS IR A LA HOME, TENDREMOS LA RESPUESTA DE ESTE CONTROLADOR
		//ANOTACION PARA INDICAR QUE LA RESPUETA LA ENVIAMOS EN EL BODY (TEXTO EN EL OBJETO RESPONSE DE LA PETICION)
		@ResponseBody
		public String iniciar() {
			
			return "Hola, soy el controlador que te envía a la home";
		}
		
		
		//ANOTACION PARA MAPEAR LA PETICION
		@RequestMapping("/saludar") //--> COLOCANDO EL PATRON DE ENTRADA CONSEGUIMOS QUE ESTE CONTROLADOR SEA EL PRIMERO QUE ES ATENDIDO POR EL DESPACHADOR O CADA VEZ QUE QUEREMOS IR A LA HOME, TENDREMOS LA RESPUESTA DE ESTE CONTROLADOR
		//ANOTACION PARA INDICAR QUE LA RESPUETA LA ENVIAMOS EN EL BODY (TEXTO EN EL OBJETO RESPONSE DE LA PETICION)
		@ResponseBody
		public String saludar() {
					return "Hola, soy el controlador que te saluda desde la ruta raiz";
		}
		
		
		//QUITAMOS LA ANOTACION PARA PODER HACER UNA REDIRECCIÓN A UNA PÁGINA		
		//spring entiende de forma automatica que si no se retorna la cadena en el body pertenecerá a una página
		@RequestMapping("/get")
	    public String getPagina1() {
			//ESTAMOS UTILIZANDO LA PAGINA SIN HABER CONFIGURADO EL VIEW RESOLVER, QUE ES EL OBJETO QUE NOS VA A FACILITAR LAS COSAS A LA HORA DE GESTIONAR LAS VISTAS
			
			return "pag";
			
			//SIN EL VIEW RESOLVER TENDRIAMOS QUE DEVOLVER TODA LA PAGINA CON LA RUTA DONDE ESTA ALOJADA, PERO ESTO DEBE DE SER CONFIGURABLE
			//return "/WEB-INF/view/pag.jsp";
		}
		
		
	

}
