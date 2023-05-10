package com.springmvc.configuracion;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


//DESCOMENTAR LA IMPLEMENTACION DE LA INTERFAZ PARA PROBAR EL FUNCIONAMIENTO DE ESTA CLASE
public class ConfigClass //implements WebApplicationInitializer
{

	//ESTE METODO SE LLAMARA AUTOMATICAMENTE POR TOMCAT AL ARRANCAR LA APLICACION. SIMMILAR AL LOAD-ON-STARTUP DE XML
	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		//ServletContext es una intefaz. Tomcat tiene una clase con la implementación de esta interfaz.
		
		//Tomcat creara automaticamente el objeto para el servlet context y leer la información de configuracion para el objeto
		
		//SOLO HAY UN SERVLETCONTEXT POR CADA APLICACION Y TODAS LA CONFIGURACIONES O INFORMACION COMPARTIDA CON MIS SERVLETS (controllers)
		
		//ESTO SOLO FUNCIONA DESDE CONTENEDORES WEB QUE MANEJEN LA VERSIÓN 3.0 DE SERVLET
		
		//ES MUY IMPORTANTE QUE COJAS O REVISES LAS IMAGENES DEL VIDEO, NO WEB.XML?selenium min 18:00 para coger la imagen. EL DISPATCHER SERVLET tiene the web application context dentro
		
		System.out.println("Estamos llamando al metodo de incializacion");
		
		//CREAMOS EL CONTEXTO DE ESTA FORMA
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(ConfigApp.class);
		
		/***  ESTO SERÍA PARA CARGAR EL XML, FORMA ANTIGUA, INTENTAR NO HACERLO PARA UN PROYECTO NUEVO
		 * 
		//SI UTILIZARAMOS LA APROXIMACION XML TENDRIAMOS QUE UTILIZAR ESTE OBJETO
		XmlWebApplicationContext webAppContext = new XmlWebApplicationContext();
		
		//ESTABLECER LA RUTA DEL BEAN
		webAppContext.setConfigLocation("app-config.xml");
		*
		*/	
			
				
		//PASARLE AL DISPATCHER EL OBJETO DE CONTEXTO. Aquio crearemos el dispathcer servlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppContext);
		
		//El nombre no tiene mucha importancia, con lo que podemos hacer un poco lo que queramos
		//registraremos el despachador en el ServletContext
	   //servletContext.addServlet("MiDispatcher", dispatcherServlet);
		
		//ESTA NOTACIÓN ES POR QUE LO QUE QUEREMOS ES LA INTERFAZ, (en este caso), QUE ESTÁ DENTRO DE LA PRIMERA (inner interface, en este caso). ES UN TIPO DENTRO DE OTRO
		ServletRegistration.Dynamic  miDispatcherPersonalizado = servletContext.addServlet("MiDispatcher", dispatcherServlet);

		//establecemos el valor de cargar en el inicio a 1 o true
		miDispatcherPersonalizado.setLoadOnStartup(1);
		
		//Si mapeamos así al despachador podremos atender todas las peticiones desde la raiz de la app
		//IMPORTANTE, INTENTAR NO UTILIZAR EL PATRON *
		miDispatcherPersonalizado.addMapping("/");	
		
		
	}

}
