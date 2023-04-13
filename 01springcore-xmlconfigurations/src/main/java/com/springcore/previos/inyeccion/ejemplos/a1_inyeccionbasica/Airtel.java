package com.springcore.previos.inyeccion.ejemplos.a1_inyeccionbasica;

public class Airtel implements Sim{

	//PARA COMPROBAR QUE EL CONSTRUCTOR ES LLAMADO POR EL FRAMEWORK, CREAMOS UN CONSTRUCTOR PARA VER QUE SE LLAMA AUTOMATICAMENTE
	public Airtel()
	{
		System.out.println("Spring llamando al constructor");
	}
	
	@Override
	public void calling() {
		System.out.println("llamando desde Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Navegando desede Airtel");
		
	}

}
