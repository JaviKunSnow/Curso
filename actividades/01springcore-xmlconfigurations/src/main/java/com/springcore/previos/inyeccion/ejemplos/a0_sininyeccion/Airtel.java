package com.springcore.previos.inyeccion.ejemplos.a0_sininyeccion;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("llamando desde Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Navegando desede Airtel");
		
	}

}
