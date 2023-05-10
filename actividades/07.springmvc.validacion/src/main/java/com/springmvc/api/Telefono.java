package com.springmvc.api;

public class Telefono {
	
	
	private String prefijo;
	private String userNumber;
	
	
	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	@Override
	public String toString() {
		return "Telefono [prefijo=" + prefijo + ", userNumber=" + userNumber + "]";
	}
	
	
	
	
	

}
