package com.springcore.previos.inyeccion.ejemplos.a6_valuesfromproperties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

@SuppressWarnings("deprecation")
public class Student {
	
	
	//De esta forma vamos a ir teniendo cada vez mas claridad a la hora escribir nuestras clases		

	private String name;
	private String interestedCourse;
	private String hobby;	
	
	
	public void displayInfo()
	{
		System.out.println(this.name);
		System.out.println(this.interestedCourse);
		System.out.println(this.hobby);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
