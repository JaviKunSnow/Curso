package com.springcore.previos.inyeccion.ejemplos.a2_configuracionporclase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//solo lo utilizamos si utilizamos la anotación @Component en alguna de las clases que tengamos
//@ComponentScan(basePackages="com.springcore.anottations")

@Configuration
public class CollegeConfig {

	//PODEMOS ESPECIFCAR MEDIANTE LA ANOTACIÓN @Bean UN METODO QUE DEVUELVA UN OBJETO. Podemos darle diferentes nombres al bean o tan solo uno si queremos
	@Bean(name= {"colBean", "college"})
	public College collegeBean() // El nombre del método se convierte en el bean id en caso de no especificar la etiqueta name
	{
		return new College();
	}
	
}
