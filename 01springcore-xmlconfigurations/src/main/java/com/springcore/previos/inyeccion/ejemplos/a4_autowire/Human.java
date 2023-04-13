package com.springcore.previos.inyeccion.ejemplos.a4_autowire;

public class Human {

	//PARA VINCULAR CON EL BEAN ByName, el nombre del atributo de la clase y el id del bean ha de ser el mismo
	private Heart heart;
	private String nombre;
	
	public Human() {
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	//ES IMPORTANTE TENER UN CONSTRUCTOR POR DEFECTO  O SI NO TENER BIEN CONFIGURADO EL CONSTRUCTOR EN EL XML YA QUE SI NO SPRING INTENTARA CREAR EL OBJETO PRIMERO UTILIZANDO EL CONSTRUCTOR
	public Human(String nombre)
	{
		System.out.println("Llamando al constructor por defecto");
	}
//
	public Human(Heart heart) {
		super();
		System.out.println("llamando al constructor");
		this.heart = heart;
	}
//	
//	public Human(Heart heart, String nombre) {
//		super();
//		System.out.println("llamando al constructor con dos parametros");
//		this.heart = heart;
//		this.nombre = nombre;
//	}
//
//	public void setHeart(Heart heart) {
//		System.out.println("llamando al setter");
//		this.heart = heart;
//	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Estas muerto");
		}

	}

}
