






package com.springcore.previos.inyeccion.ejemplos.a2_settersYconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
	
	
		
		//UTILIZAREMOS SIEMPRE LA INTERFAZ APPLICATIONCONTEXT PARA CONFIGURACION XML O ANOTACIONES
		ApplicationContext context = new ClassPathXmlApplicationContext("beansEjemplo2.xml");
		
		
		//Hasta aquí la carga de objetos
		System.out.println("Se ha cargado el fichero xml en el contendor");
		
		//CREAMOS ESTOS DOS BEANS DEFINIDOS EN EL XML PARA PROBAR LA INYECCION POR SETTER
		Student student = context.getBean("student",Student.class);
		student.displayStudentInfo();
		
		
//		Student student2 = context.getBean("student2",Student.class);
//		student2.displayStudentInfo();
		
		
		//CREAMOS ESTE BEAN DEFINIDO EN EL XML PARA PROBAR LA INYECCION POR CONSTRUCTOR
//		Student student3 = context.getBean("student3",Student.class);
//		student3.displayStudentInfo();
		
		
		
		///¿EXPLICA LA SALIDA DEL PROGRAMA EN LA CONSOLA? --> SOLUCIÓN, LO PRIMERO QUE HACE SPRING AL ARRANCAR EL PROGRAMA ES
		//CARGAR EN EL CONTENEDOR DE APLICACIONES TODOS LOS OBJETOS REGISTRADOS EN EL FICHERO XML, DE TAL MANERA QUE UTILIZA EL CONSTRUCTOR POR DEFECTO DE LA CLASE
		//TAL Y COMO PODEMOS VER EN LA EJECUCION.
		
		//UNA VEZ CARGADA LA LISTA DE OBJETOS QUE TIENE EL FICHERO, PODREMOS RECUPERAR, A TRAVES DEL OBJETO CONTEXT, LOS OBJETOS ALMACENADOS EN EL CONTENEDOR.
		
		//HACEMOS ESTE TIPO DE CASTING PARA PODER UTILIZAR EL METODO DE LA CLASE, YA QUE NOSOTROS HEMOS HECHO LA INSTANCIA DEL CONTEXTO A TRAVES DE LA INTERFAZ
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
