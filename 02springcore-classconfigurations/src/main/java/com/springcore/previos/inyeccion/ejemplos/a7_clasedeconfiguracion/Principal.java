package com.springcore.previos.inyeccion.ejemplos.a7_clasedeconfiguracion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("beansEjemplo4.xml");

		//Creado con el corazon especificado por la anotacion qualifier
		HeartContainer human = context.getBean("human", HeartContainer.class);
		human.startPumping();

		//creado con la configuracion del bean octopues heart directamente en las propiedades del bean en el XML
		HeartContainer human2 = context.getBean("octopus", HeartContainer.class);

		human2.startPumping();
		

	}

}
