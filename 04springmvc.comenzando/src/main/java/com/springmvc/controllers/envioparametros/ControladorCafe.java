package com.springmvc.controllers.envioparametros;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControladorCafe {
	
	@RequestMapping(value = "/cafe", method = RequestMethod.GET)
	//Para pasar datos a la vista utilizamos los objetos Model o Model&View
	public String cafe(Model model)
	{
		
		//SETEAMOS VALORES EN EL MODELO PARA QUE PUEDAN SER PASADOS A LA VISTA				
		model.addAttribute("title", "Cafe APP");
		
		
		//DEVOLVEMOS LA VISTA POR SU NOMBRE
		//IMPORTANTE!!! --> LA VISTA DEBE DE TENER EL ACTIVO PARA PODER MOSTRAR LOS DATOS
		return "cafe";		
		
	}
	
	
	@RequestMapping(value = "/realizarPedido", method = RequestMethod.GET)
	public String cafe(Model model, HttpServletRequest request)
	{
		//SETEAMOS VALORES EN EL MODELO PARA QUE PUEDAN SER PASADOS A LA VISTA				
		model.addAttribute("comida", request.getParameter("comida"));
		
		
		//DEVOLVEMOS LA VISTA POR SU NOMBRE
		//IMPORTANTE!!! --> LA VISTA DEBE DE TENER EL ACTIVO PARA PODER MOSTRAR LOS DATOS
		return "pedidoRealizado";	
	}
			

}
