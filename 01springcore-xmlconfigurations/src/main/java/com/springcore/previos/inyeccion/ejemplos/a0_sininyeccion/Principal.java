package com.springcore.previos.inyeccion.ejemplos.a0_sininyeccion;


public class Principal {

	
	public static void main(String[] args) {
		
		
		//ESTA SERÍA UNA IMPLEMENTACIÓN TRADICIONAL PARA PODER UTILIZAR NUESTROS OBJETOS DE FORMA DIRECTA
		//EL PROBLEMA ES QUE CUANDO QUIERA UTILIZAR OTRO OBJETO DE OTRO TIPO TENDRÍA QUE CREAR UNO NUEVO OBJETO DE OTRO TIPO
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		
		Vodafone vodafone = new Vodafone();
		vodafone.calling();
		vodafone.data();
		
		
		//PERO PODEMOS UTILIZAR LA INTERFAZ PARA, APLICANDO POLIMORFISMO, TENER UN CONTENDOR PARA DIFERENTES OBJETOS
		Sim sim = new Airtel();
		Sim sim2 = new Vodafone();
		sim.calling();
		sim.data();
		sim2.calling();
		sim2.data();
		
		
		//UNO DE LOS PRINCIPIOS MAS IMPORTANTES PARA UTILIZAR EL FRAMEWORK ES QUE LA APP DEBE DE SER CONFIGURABLE
		//¿COMO CONFIGURAMOS LA APP? -> EXISTEN DOS MANERAS, XML O ANOTACIONES o SPRING BOOT --> QUE NOS CONFIGURA MUCHOS DE LOS ASPECTOS IMPORTANTES PARA EMPEZAR A DESARROLLAR UNA APLICACION DE FORMA PROFESIONAL
		//DOS COSAS IMPORTANTES A LAS QUE NOS VA A AYUDAR SPRING CORE ES A CREAR OBJETOS POR NOSOTROS Y A UTILIZAR OBJETOS POR NOSOTROS
		//Y LO VA A HACER A TRAVES DEL CONTENEDOR DE INVERSION DE CONTROL Y EL FICHERO DE CONFIGURACION QUE HAYAMOS PROPORCIONADO
		
		//EXISTEN DOS TIPOS DE INVERSION DE CONTROL CONTAINER, BEANFACTORY & APPLICATIONCONTEXT --> SIEMPRE UTILIZAREMOS LA INTERFAZ APPLICATIONCONTEXT YA QUE ES MUCHO MAS MODERNO
		
		//PARA PODER MANEJAR LA APLICACION PODEMOS UTILIZAR LA CLASE QUE IMPLEMENTA LA INTERFAZ ClassPathXmlApplicationContext o si utilizamos anotaciones utilizaremos AnnotationConfig
	}
}