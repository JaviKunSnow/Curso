package com.springcore.previos.inyeccion.ejemplos.a7_valuesfrompropertiesanottations;

import org.springframework.beans.factory.annotation.Value;


public class Student {
	
	
	//TENIENDO LAS ANOTACIONES DIRECTAMENTE SOBRE LOS ATRIBUTOS NO HARÍA FALTA TENER LA IMPLEMENTACIÓN DE LOS METODOS
	//De esta forma vamos a ir teniendo cada vez mas claridad a la hora escribir nuestras clases
		
	@Value("${student.name}")
	private String name;
	
	//Required no se permite en este sitio, con lo que perderiamos esa funcionalidad si no usamos autowire
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	//PODEMOS UTILIZAR EL para cargar los datos de los objetos
	@Value("${student.hobby}")
	private String hobby;
	
	//UTILIZAMOS LA ANOTACION @Value PARA ESTABLECER UN VALOR PARA EL ATRIBUTO DE LA CLASE
	
	//UTILIZAMOS LA ANOTACION @Required PARA OBLIGAR A LA INSERCIÓN DE UN VALOR A LA HORA DE LA CREACIÓN DEL OBJETO
	//ES OBLIGATORIO UTILIZARLA JUNTO CON LA ETIQUETRA @Value
	//ESTA DEPRECADA DESDE SPRING 5.1 PARA OBLIGAR A HACER LA INYECCION DESDE EL CONSTRUCTOR DE TAL FORMA QUE DE FORMA IMPLICITA YA SE REQUIERE
	//ADEMAS NOS APOYAREMOS DE FORMA CONSTANTE EN LA ETIQUETA @Autowire que veremos más adelante
	
//	@Value("Javi")
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	//SIMPLEMENTE LO TENEMOS ASÍ PARA EL EJEMPLO PERO ES RECOMENDABLE NO HACERLO ASÍ
//	@Required
//	@Value("Spring boot")
//	public void setInterestedCourse(String interestedCourse) {
//		this.interestedCourse = interestedCourse;
//	}
//		
//	//PODEMOS UTILIZAR EL para cargar los datos de los objetos
//	@Value("${student.hobby}")
//	public void setHobby(String hooby) {
//		this.hobby = hooby;
//	}
//	
		
	
	public void displayInfo()
	{
		System.out.println(this.name);
		System.out.println(this.interestedCourse);
		System.out.println(this.hobby);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
