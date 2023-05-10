package com.springcore.previos.inyeccion.ejemplos.a3_beanscope;

public class Student {


	private String studentName;
	private int id;

	// PARTE 2 DE LA INYECCION DE DEPENDENCIAS
	// Vamnos a inyectar la dependencia de este atributo 	
	private MathCheat mathCheat; // = new MathCheat(); --> RECUERDA, NUNCA HARIAMOS ESTO.
	// PARA INYECTAR EL VALOR DE UN OBJETO NECESITAMOS CONFIGURAR UN inner Bean  DENTRO DE STUDENT EN EL XML
	
	public Student() {

	}

	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}

	public Student(String studentName, int id, MathCheat mathCheat) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.mathCheat = mathCheat;
	}

	public void displayStudentInfo() {
		System.out.println("El nombre del estudiante es: " + this.studentName);
		System.out.println("El id del estudiante es: " + this.id);
		System.out.println("La referencia del objeto mathCheat es: " + this.mathCheat);
	}

	// NO PODEMOS REMOVER LOS SETTERS YA QUE SPRING LOS UTILIZA PARA INYECTAR a no ser que definanmos inyeccion por constructor
	// Eleminar para ver el error
	public void setStudentName(String studentName) {
		System.out.println("Seteando el nombre");
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getId() {
		return id;
	}

	public MathCheat getMathCheat() {
		return mathCheat;
	}

	public void setId(int id) {
		System.out.println("Seteando el id");
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	
	
	

	public void cheating() {
		if (this.mathCheat != null) {
			mathCheat.mathCheating();
		} else {
			System.out.println("No hay memoria para engañar en el examen de mates");
		}

	}

}
