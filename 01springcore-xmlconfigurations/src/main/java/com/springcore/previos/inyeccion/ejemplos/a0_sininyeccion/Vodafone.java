package com.springcore.previos.inyeccion.ejemplos.a0_sininyeccion;


public class Vodafone implements Sim{
	
	Airtel airtel;
	
	
	Vodafone()
	{
		this.airtel = new Airtel();
	}
	
	Vodafone(Airtel airtel)
	{
		this.airtel = airtel;
	}

	@Override
	public void calling() {
		System.out.println("llamando desde Vodafone");
		
	}

	@Override
	public void data() {		
		System.out.println("Navegando desede Vodafone");		
	}
	
	
	public void main() {
		
		Airtel airtel = new Airtel();
		Vodafone vod = new Vodafone(airtel);
	}
	
	

}