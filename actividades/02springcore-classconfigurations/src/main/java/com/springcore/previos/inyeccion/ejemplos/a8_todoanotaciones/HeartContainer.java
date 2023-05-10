package com.springcore.previos.inyeccion.ejemplos.a8_todoanotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HeartContainer {

	// MUCHO MEJOR PONERLAS AQUÍ DIRECTAMENTE
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	// PUEDO PONER LAS ANOTACIONES a nivel de metodo, PERO SI LAS PONGO DONDE EL
	// ATRIBUTO DIRECTAMENTE
	// SPRING LO VA A DETECTAR Y HACER LA INYECCION DIRECTAMENTE

	// @Autowired
	// @Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		System.out.println("llamando al setter");
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
		} else {
			System.out.println("Estas muerto");
		}
	}
	
//Si no hay ningun constructor en la clase Spring llamara al constructor por defecto
//	public HeartContainer()
//	{
//		
//	}
	
//	public HeartContainer(Heart heart) {
//		super();
//		System.out.println("llamando al constructor");
//		this.heart = heart;
//	}

}
