package com.springcore.previos.inyeccion.ejemplos.a2_configuracionporclase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		
		//ApplicationContext context = new ClassPathXmlApplicationContext("misBeans.xml");
		//A partir de aquí ya no utilizaremos este objeto si no que utilizaremos el objeto de configuracion
		
		//AHORA UTILIZAMOS ESTE OBJETO Y LE PASAMOS LA CLASE DE CONFIGURACION
		//¿QUE PASA SI QUIERO PASAR MAS DE UNA CLASE DE CONFIGURACION --> REVISAR LOS METODOS QUE OFRECE
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		
		//A LA HORA DE OBTENER EL BEAN DEFINIDO DENTRO DE LA CLASE UTILIZAMOS EL NOMBRE DEL METODO DE LA CLASE QUE DEVUELVE EL OBJETO (BEAN) EN CASO DE NO TENER LA PROPIEDAD NAME ASIGNADA
		//PARA OBTENER ESTE OBJETO ESTAMOS PASANDO EL NOMBRE DE LA ANOTACIÓN COMPONENT DE LA CLASE College, 
		
		//DESCOMENTAR ESTE CODIGO PARA PROBAR @Component y @ComponentScan
//		College college = context.getBean("collegeBean", College.class);
//		System.out.println(college);
//		college.test();

		
		//SI UTILIZO ALIAS YA NO PUEDO UTILIZAR EL NOMBRE DEL METODO, YA QUE ES EL VALOR POR DEFECTO
		College college = context.getBean("college", College.class);
		System.out.println(college);
		college.test();
		
		 college = context.getBean("colBean", College.class);
		System.out.println(college);
		college.test();
		
		
		//COMO SE PUEDE APRECIAR EN LA SALIDA, SPRING CREA DOS OBJETOS DISTINTOS, 
		// CollegeBean se refiere al objeto creado cuando tenemos las anotaciones componentScan y component activas,
		// Los dos segundos se crean a traves de sus alias, pero al ser el mismo bean Spring utiliza la misma referencia de memoria para los dos
		
		
		//MAS ADELANTE VEREMOS LAS FORMAS DE CREAR BEANS PARA QUE SEAN DISTINTOS O EL MISMO, SU CICLO DE VIDA Y SU SCOPE
		
	}

}
