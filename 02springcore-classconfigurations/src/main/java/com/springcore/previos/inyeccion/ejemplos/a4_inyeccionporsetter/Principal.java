package com.springcore.previos.inyeccion.ejemplos.a4_inyeccionporsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

			
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
				
		//SI UTILIZO ALIAS YA NO PUEDO UTILIZAR EL NOMBRE DEL METODO, YA QUE ES EL VALOR POR DEFECTO, como no tenemos alias en este caso utilizamos el nombre del método
		College college = context.getBean("collegeBean", College.class);
		System.out.println(college);
		college.test();
		
		//HEMOS CAMBIADO LA INSTANCIA DE LA INTERFAZ A UNA CLASE PARA PODER UTILIZAR EL METODO CLOSE SIN LA NECESIDAD DE HACER EL CASTING
		context.close();
		
		
		
	}

}
