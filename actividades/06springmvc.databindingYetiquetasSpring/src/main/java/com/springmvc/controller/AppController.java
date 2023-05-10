package com.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.api.UserInfoDTO;

@Controller
public class AppController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	//public String getHome(UserInfoDTO userInfo, Model model, BindingResult bindigin) {
	//La etiqueta @ModelAttribute se encarga de hacer la vinculacion entre nuestro objeto, en este caso el DTO y el objeto modelo
	public String getHome(@ModelAttribute("userInfo") UserInfoDTO userInfo,  BindingResult binding) {
				
				
		//UTILIZAMOS EL OBJETO DE BINDING PARA VER SI TODO HA IDO BIEN O TENEMOS QUE CONTROLAR ALGUN TIPO DE ERROR
		if (binding.hasErrors()) {
			System.out.println("errores en la vinculacion del DTO");
		} else {
			System.out.println(userInfo.getNombre() + " " + userInfo.getOtroNombre());
		}
		
		List<org.springframework.validation.ObjectError> lista = binding.getAllErrors();

				
		return "home";
	}

	@RequestMapping(path = "/calcular", method = RequestMethod.POST)	
	public String calcular(@ModelAttribute("userInfo") UserInfoDTO userInfo, Model model, BindingResult bindigin) {
		
		if (bindigin.hasErrors()) {
			System.out.println("errores en la vinculacion del DTO");
		} else {
			System.out.println(userInfo.getNombre() + " " + userInfo.getOtroNombre());
		}
		
		System.out.println("Nombre desde el modelo "  + ((UserInfoDTO)model.getAttribute("userInfo")).getNombre());
		
		System.out.println(userInfo.getOtroNombre());
		System.out.println(userInfo.getNombre());
		System.out.println(userInfo.getOtroNombre());
		
		
		// Los mandamos a la siguiente pagina ¿Esto sería necesario?
		//model.addAttribute("nombre", userInfo.getNombre());
		//model.addAttribute("otroNombre", userInfo.getOtroNombre());

		return "resultado-home";
	}



	@RequestMapping("/calcular2")
	//VAMOS A INTRODUCIR LA ANOTACION @RequestParam Los parametros que vengan en el metodo TIENEN QUE TENER EL MISMO NOMBRE QUE EL atributo name del input
	public String calcular2(@RequestParam String nombre,  @RequestParam String otroNombre, Model model)
	{
		//Probamos si vienen los datos enviados del formulario
		System.out.println(nombre + " " + otroNombre);
		
		//Los mandamos a la siguiente pagina
		model.addAttribute("nombre", nombre);
		model.addAttribute("otroNombre", otroNombre);
		
		return "resultado-home";
	}
}
