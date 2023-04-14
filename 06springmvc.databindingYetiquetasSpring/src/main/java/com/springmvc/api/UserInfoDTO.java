package com.springmvc.api;


//Importar librerias y utilizar lombok 
public class UserInfoDTO {

	private String nombre;
	private String otroNombre;
	
	
	//VAMOS A DARLE DATOS DE FORMA INICIAL PARA QUE PODAMOS PASARLOS AL FORMULARIO NADA MAS QUE SE CARGA.
	//ES TAN SOLO UN EJEMPLO PARA QUE VEAMOS COMO ESTA HECHA LA VINCULACIÓN DE DATOS 
	
	public UserInfoDTO()
	{
		this.nombre = "UnNombre";
		this.otroNombre = "OtroNombre";
		
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setOtroNombre(String otroNombre) {
		this.otroNombre = otroNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getOtroNombre() {
		return otroNombre;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [nombre=" + nombre + ", otroNombre=" + otroNombre + "]";
	}

}
