package com.springcore.previos.inyeccion.ejemplos.a2_settersYconstructor;

public class Student {

	
	private String studentName;
	private int id;

	// Es recomendable tener un un constructor por defecto cuando utilizamos algun otro constructor en nuestra clase ya que Spring en algunas ocasiones utiliza el de por defecto para crear objetos
	public Student() {
	System.out.println("Spring llamando al constructor por defecto");
	}

	//constructor de dos parametros para el objeto student 3 del fichero xml
	public Student(String studentName, int id) {
		super();
		System.out.println("Spring llamando al constructor del objeto student de dos parametros");
		this.studentName = studentName;
		this.id = id;
	}
	
	//constructor de un parametro para el objeto student 4 del fichero xml
	public Student( int id) {
		super();
		System.out.println("Spring llamando al constructor del objeto student de un parametro");		
		this.id = id;
	}

	public void displayStudentInfo() {
		System.out.println("El nombre del estudiante es: " + this.studentName);
		System.out.println("El id del estudiante es: " + this.id);
	}

	// TANTO LOS SETTER COMO LOS CONSTRUCTORES SPRING LOS UTILIZA PARA INYECTAR LOS  VALORES DE LOS ATRIBUTOS O DEPENDENCIAS

	// Eliminar para ver el error
	public void setStudentName(String studentName) {
		System.out.println("Spring Seteando el nombre");
		this.studentName = studentName;
	}

	public void setId(int id) {
		System.out.println("Spring Seteando el id");
		this.id = id;
	}

}
