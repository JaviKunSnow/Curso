package com.springmvc.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.springmvc.api.TelefonoFormatter;



@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.springmvc.controller")
//VAMOS A INTRODUCIR EL USO DE ESTA INTERFZ PARA PODER USAR LOS FORAMTEADORES.
public class ConfigApp implements WebMvcConfigurer {

	// ES MUY IMPORTANTE ACORDARSE DE QUE EL VIEW RESOLVER ES UN BEAN DENTRO DE
	// SPRING, YA QUE TODOS LOS OBJETOS QUE QUEREMOS USAR DESDE SPRING LO SON
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;

	}
	
	
	@Override
	public void addFormatters(FormatterRegistry registry) {	
		//Eliminamos lo que hay y registramos nuestro formateador	ç
		System.out.println("Ahora registramos el foramteador");
		registry.addFormatter(new TelefonoFormatter());
	}

}
