package com.springcore.previos.inyeccion.ejemplos.a5_ciclodevida;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
				
		ApplicationContext context = new ClassPathXmlApplicationContext("beansEjemplo5.xml");
		
		
		//SI UTILIZO ALIAS YA NO PUEDO UTILIZAR EL NOMBRE DEL METODO, YA QUE ES EL VALOR POR DEFECTO, como no tenemos alias en este caso utilizamos el nombre del método
		StudentDAO student= context.getBean("student", StudentDAO.class);
		student.selectAll();
		
		student.deleteSingleRow();
		
		//HEMOS CAMBIADO LA INSTANCIA DE LA INTERFAZ A UNA CLASE PARA PODER UTILIZAR EL METODO CLOSE SIN LA NECESIDAD DE HACER EL CASTING
		((ClassPathXmlApplicationContext)context).close();
		
		
	}
}
