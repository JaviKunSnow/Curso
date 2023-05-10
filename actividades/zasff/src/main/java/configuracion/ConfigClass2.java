package configuracion;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//EN ESTA OCASION EXTENDEMOS DE ESTA CLASE PARA PODER TULIZAR LOS SIGUIENTES METODOS
//A PARTIR DE AQUI, SPRING GESTIONARA LAS INYECCIONES PARA CREAR EL DISPATCHER SERVLET

//DESCOMENTAR LA IMPLEMNTACION DE LA INTERFAZ EN LA OTRA CLASE PARA PROBAR EL EJEMPLO
public class ConfigClass2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Llamamos al metodo de RootConfigClasess. Este no hace nada");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Llamamos al metodo de carga de archivo de configuracion");
		
		Class<?> arr[] = {ConfigApp.class};		
		return arr;
	}

	
	//ESTE METODO NOS SIRVE PARA PASAR RUTAS A NUESTRO SERVLET QUE VA A PODER RECONOCER Y REDIRIGIRNOS A ELLAS
	@Override
	protected String[] getServletMappings() {
		
		System.out.println("Llamamos al metodo de mapeo desde el archivo de configuración");
		String arr[] = {"/"};
		
		return arr;
	}

}
