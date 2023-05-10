package com.springcore.previos.inyeccion.ejemplos.a4_inyeccionporsetter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//solo lo utilizamos si utilizamos la anotación @Component en alguna de las clases que tengamos
//@ComponentScan(basePackages="com.springcore.anottations")

@Configuration
public class CollegeConfig {

	//PODEMOS ESPECIFCAR MEDIANTE LA ANOTACIÓN @Bean UN METODO QUE DEVUELVA UN OBJETO
	//Podemos darle diferentes nombres al bean o tan solo uno si queremos
	@Bean()
	public College collegeBean() // El nombre del método se convierte en el bean id en caso de no especificar la etiqueta name
	{
		College col = new College();
		col.setDirector(directorBean());
		col.setTeacher(mathTeacherBean());
		return col;
		
	}
	
	@Bean
	public Director directorBean()
	{
		return new Director();
	}
	
	@Bean
	public Teacher mathTeacherBean()
	{
		return new MathTeacher();
	}
	
}
