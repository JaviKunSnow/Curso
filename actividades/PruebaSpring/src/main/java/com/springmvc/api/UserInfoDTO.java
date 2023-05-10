package com.springmvc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message="El nombre no puede estar en blanco")
	//@Min(value = 2, message="Nombre muy corto")
	//@Max(value = 15, message = "Nombre muy largo")
	@Size(min=2, max = 15, message="Revisar longitud del campo nombre")
	private String nombre;
	
	@NotBlank(message="El nombre el otro nombre no puede estar en blanco")
	private String otroNombre;
	
	//PODEMOS VINCULAR LA PROPIEDAD AL VALOR DEL CHECKBOX DEL FORMULARIO, AL SER SOLO UNO, PUEDE TRATARSE COMO UN BOOLEANO A TRAVES DE SU PROPIEDAD CHECKED
	@AssertTrue(message="Tienes que marcar para poder continuar")
	private boolean terms;
	
		
	
	
	//VAMOS A DARLE DATOS DE FORMA INICIAL PARA QUE PODAMOS PASARLOS AL FORMULARIO NADA MAS QUE SE CARGA.
	//ES TAN SOLO UN EJEMPLO PARA QUE VEAMOS COMO ESTA HECHA LA VINCULACIÓN DE DATOS 	
	public UserInfoDTO()
	{
//		this.nombre = "UnNombre";
//		this.otroNombre = "OtroNombre";
		System.out.println("Llamamos al constructor del objeto DTO");
		
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setOtroNombre(String otroNombre) {
		this.otroNombre = otroNombre;
	}

	
	//NO ES NECESARIO CAMBIAR, EN CASO DE SER BOOLEANO, EL NOMBRE DE ESTE METODO, LO MAPEA AUTOMATICAMENTE POR EL TIPO
	public boolean isTerms() {
		return terms;
	}


	public void setTerms(boolean terms) {
		this.terms = terms;
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
