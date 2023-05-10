
package com.springcore.previos.inyeccion.ejemplos.a6_autowiredYqualifier;

public class Heart {

	String nombre;
	String numero;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void pump() {
		System.out.println("Tu corazon esta latiendo, eres un " + getNombre() + " y tienes un numero total de " + getNumero() + " corazones");
		System.out.println("Estas vivo!!!");
	}

}
