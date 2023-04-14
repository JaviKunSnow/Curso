package com.springmvc.api;


public class UserContactDTO {
	
	private String email = "emailprueba@gmail.com";
	private Telefono  telefono;
	
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}	

}
