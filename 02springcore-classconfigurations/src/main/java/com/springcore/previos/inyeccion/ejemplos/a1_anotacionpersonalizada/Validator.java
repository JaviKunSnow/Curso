package com.springcore.previos.inyeccion.ejemplos.a1_anotacionpersonalizada;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

public class Validator {
	
	
	public boolean validar( @Validated(AgeValidator.class)  UserRegisterDTO usuario, BindingResult resultado) {	
		
		if (resultado.hasErrors()) {
			for (Object error : resultado.getAllErrors()) {
				System.out.println(error);
			}
			return false;
		} else {
			return true;
		}

	}

}
