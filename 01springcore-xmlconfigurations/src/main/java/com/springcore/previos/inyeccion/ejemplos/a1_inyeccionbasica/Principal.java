package com.springcore.previos.inyeccion.ejemplos.a1_inyeccionbasica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansEjemplo1.xml");
		// En este momento Spring ha registrado el bean que hemos definido en nuestro fichero de configuracion

		System.out.println("El fichero se ha cargado correctamente");

		// Obtenemos nuestro bean a traves del contexto
		Airtel airtel = (Airtel) context.getBean("airtel");
		airtel.calling();
		airtel.data();

		// Obtenemos nuestro bean a traves del contexto
		Vodafone vodafone = (Vodafone) context.getBean("vodafone");
		vodafone.calling();
		vodafone.data();

		// Obtenemos nuestro bean a traves del contexto y podemos meterlo en una interfaz haciendo el casting correspondiente
		Sim sim = (Vodafone) context.getBean("sim");
		sim.calling();
		sim.data();

		// Obtenemos nuestro bean a traves del contexto y podemos meterlo dentro de una interfaz haciendo el casting
		sim = (Airtel) context.getBean("airtel");
		sim.calling();
		sim.data();
		
		//DE ESTA MANERA CONSEGUIMOS PODER DINAMIZAR LA OBTENCIÓN DE OBJETOS
		
		//PARA EVITAR EL CASTING PODEMOS ESPECIFICAR LA CLASE COMO PARAMETRO DEL METODO y DE ESTA FORMA YA SOLAMENTE TENDRIAMOS QUE CAMBIAR EL ARCHIVO DE CONFIGURACIÓN
		sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
		//Cerramos el contexto
		((ClassPathXmlApplicationContext)context).close();
		
	}
}