package com.springcore.previos.inyeccion.ejemplos.a3_inyeccionporconstruccion;

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
		System.out.println("Spring llamando a collegeBean");
		return new College(directorBean());
	}
	
	@Bean
	public Director directorBean()
	{
		System.out.println("Spring llamando a directorBean");
		return new Director();
	}
	
}
