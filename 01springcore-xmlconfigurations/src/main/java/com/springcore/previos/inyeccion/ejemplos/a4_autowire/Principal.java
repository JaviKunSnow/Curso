package com.springcore.previos.inyeccion.ejemplos.a4_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansEjemplo4.xml");

//		Human human = context.getBean("human", Human.class);
//
//		human.startPumping();

		Human human2 = context.getBean("human2", Human.class);

		human2.startPumping();

		Human human3 = context.getBean("human3", Human.class);

		human3.startPumping();
		System.out.println(human3.getNombre());
		
		Human human4 = context.getBean("human4", Human.class);
		human4.startPumping();
		System.out.println(human4.getNombre());

		((ClassPathXmlApplicationContext)context).close();
	}

}
