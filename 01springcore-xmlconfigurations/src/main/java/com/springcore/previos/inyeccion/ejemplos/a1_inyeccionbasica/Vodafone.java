package com.springcore.previos.inyeccion.ejemplos.a1_inyeccionbasica;


public class Vodafone implements Sim{

	
	public Vodafone() {
		System.out.println("Spring llamando al constructor de Vodafone");
	}
	
	@Override
	public void calling() {
		System.out.println("llamando desde Vodafone");
		
	}

	@Override
	public void data() {
		System.out.println("Navegando desede Vodafone");
		
	}

}