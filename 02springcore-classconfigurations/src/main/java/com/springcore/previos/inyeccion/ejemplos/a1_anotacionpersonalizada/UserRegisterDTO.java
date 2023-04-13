package com.springcore.previos.inyeccion.ejemplos.a1_anotacionpersonalizada;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;


public class UserRegisterDTO {

	@NotEmpty
	@NotBlank
	@NotNull(message="El campo no puede ser nulo")
	private String name;

	@Age(lower = 18, upper = 75)	
	private Integer age;
	
	public UserRegisterDTO() {
		System.out.println("Spring llamando al constructor por defecto");
		System.out.println(this.name + "  " + this.age);
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUserName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
