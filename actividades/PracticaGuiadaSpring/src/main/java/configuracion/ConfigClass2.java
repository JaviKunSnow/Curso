package configuracion;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//EN ESTA OCASION EXTENDEMOS DE ESTA CLASE PARA PODER TULIZAR LOS SIGUIENTES METODOS
//A PARTIR DE AQUI, SPRING GESTIONARA LAS INYECCIONES PARA CREAR EL DISPATCHER SERVLET

//DESCOMENTAR LA IMPLEMNTACION DE LA INTERFAZ EN LA OTRA CLASE PARA PROBAR EL EJEMPLO
public class ConfigClass2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Spring obteniendo los ficheros de configuración raiz");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Spring buscando la clase de configuración del servlet");
		
		Class<?> arr[] = {ConfigApp.class};
		
		return arr;
	}

	
	//ESTE METODO NOS SIRVE PARA PASAR RUTAS A NUESTRO SERVLET QUE VA A PODER RECONOCER Y REDIRIGIRNOS A ELLAS
	@Override
	protected String[] getServletMappings() {
		
		System.out.println("Spring cargando las rutas de la aplicación");
		String arr[] = {"/", "/test"};
		
		return arr;
	}

}
