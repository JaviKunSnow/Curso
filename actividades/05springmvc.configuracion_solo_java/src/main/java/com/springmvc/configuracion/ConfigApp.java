package com.springmvc.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//ESTA FORMA DE CONFIGURAR EL DISPATHCER ES PARA TENER TODO EL CONTROL SOBRE SU CONFIGURACIÓN. EN EL OTRO FICHERO VEREMOS UNA FORMA MAS DE HACERLO


//importante para que se activan todas las configuraciones de mvc 
@EnableWebMvc
//Tan solo con esto ya no necesitaríamos nuestro fichero de configuración de spring, tendría que sustituirlo por estas dos clases que que tenemos en este paquete
@Configuration
//Le decimos en que paquetes queremos que busque nuestros @Beans del tipo que sea
@ComponentScan(basePackages = "com.springmvc.controller")
public class ConfigApp {
	
	
	//EN ESTAS CLASES CONFIGURAREMOS METODOS QUE NOS DEVUELVAN CLASES Y QUE SERAN TRATADAS COMO BEAN POR SPRING. Importante añadir la anotacion @Bean.

	//ES MUY IMPORTANTE ACORDARSE DE QUE EL VIEW RESOLVER ES UN BEAN DENTRO DE SPRING al igual otros elementos que veremos más adelante.
	
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");		
		
		return viewResolver;

	}

}
