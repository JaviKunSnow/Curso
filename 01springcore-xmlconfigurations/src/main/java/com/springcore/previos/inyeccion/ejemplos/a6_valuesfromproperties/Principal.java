package com.springcore.previos.inyeccion.ejemplos.a6_valuesfromproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansEjemplo6.xml");
		//CREAMOS ESTOS DOS BEANS DEFINIDOS EN EL XML PARA PROBAR LA INYECCION POR SETTER
		Student student = context.getBean("student", Student.class);
		student.displayInfo();
	}

}
