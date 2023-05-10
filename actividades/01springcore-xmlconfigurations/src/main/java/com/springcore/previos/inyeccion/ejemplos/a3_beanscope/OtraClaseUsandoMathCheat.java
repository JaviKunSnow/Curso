package com.springcore.previos.inyeccion.ejemplos.a3_beanscope;

//SI OTRA CLASE USA LA MISMA DEPENDENCIA, NO DEBERIAMOS DE TENER QUE CONFIGURAR EL XML TODO EL TIEMPO CON EL MISMO INNER BEAN
public class OtraClaseUsandoMathCheat {

	private String studentName;
	private int id;
	private MathCheat mathCheat; // = new MathCheat(); --> RECUERDA, NUNCA HARIAMOS ESTO.

	public OtraClaseUsandoMathCheat() {

	}

	public OtraClaseUsandoMathCheat(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}

	public OtraClaseUsandoMathCheat(String studentName, int id, MathCheat mathCheat) {
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

	public void setStudentName(String studentName) {
		System.out.println("Seteando el nombre");
		this.studentName = studentName;
	}

	public void setId(int id) {
		System.out.println("Seteando el id");
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
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

	public void cheating() {
		if (this.mathCheat != null) {
			mathCheat.mathCheating();
		} else {
			System.out.println("No hay memoria para engañar en el examen de mates DESDE LA OTRA CLASE");
		}

	}

}
