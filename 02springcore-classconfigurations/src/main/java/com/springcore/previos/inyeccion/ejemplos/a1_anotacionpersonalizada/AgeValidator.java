package com.springcore.previos.inyeccion.ejemplos.a1_anotacionpersonalizada;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

//Tenemos que utilizar la interfaz para poder hacer que la clase sea un parametro valido en la interfaz de la anotacion
@Component
public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int upper;
	private int lower;

	// Es interesante añadir el metodo initialize para hacer algo en la preconstrucción
	@Override
	public void initialize(Age age) {
		System.out.println("Llamamos al metodo de inicialización de valores");
		// Asignamos los valores para poder hacer la validación mas adelante
		//las llamadas a estos metodos lo que devuelven son los valores por defecto que hemos declarado en la anotación
		this.upper = age.upper();
		this.lower = age.lower();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {

		System.out.println("Llamamos al metodo de comprobar si los datos cumplen las condiciones");
		if(age == null)
		{
			return false;
		}
		
		if (age < lower || age > upper) {
			return false;
		}

		return true;

	}

}
