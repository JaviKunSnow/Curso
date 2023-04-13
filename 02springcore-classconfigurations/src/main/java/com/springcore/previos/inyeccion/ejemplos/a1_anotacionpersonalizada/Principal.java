package com.springcore.previos.inyeccion.ejemplos.a1_anotacionpersonalizada;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;

public class Principal {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansEjemplo2.xml");
		//CREAMOS ESTOS DOS BEANS DEFINIDOS EN EL XML PARA PROBAR LA INYECCION POR SETTER
		
				
		Validator  validador = new Validator();		
		
		UserRegisterDTO usuario = context.getBean("userDTO", UserRegisterDTO.class);
		
		System.out.println(usuario.getUserName()  + " " + usuario.getAge());
		
				
		if(validador.validar(usuario, new BeanPropertyBindingResult(usuario, "usuario")))
			System.out.println("Se ha validado el usuario");
		else {
			System.out.println("No se ha validado el usuario");
		}

		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
