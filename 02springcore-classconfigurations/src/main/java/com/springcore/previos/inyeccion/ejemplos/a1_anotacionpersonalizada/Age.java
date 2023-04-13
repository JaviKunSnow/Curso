package com.springcore.previos.inyeccion.ejemplos.a1_anotacionpersonalizada;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
//IMPORTANTE AÑADIR ESTA ANOTACION
@Constraint(validatedBy = {AgeValidator.class })
public @interface Age {
	
	//ESTAS PRIMERAS TRES LINEAS ESTAN COPIADAS DE UNA ANOTACIÓN, NOT-BLANK EN CONCRETO
	String message() default "{La edad debe de tener unos limites}";
	//Mensaje configurado en el fichero de propiedades en la carpeta de resources. De momento no funciona
	//String message() default "{invalidUserAge}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	

	//Metodos para devolver valores
	int lower() default 18;
	int upper() default 75;

}
