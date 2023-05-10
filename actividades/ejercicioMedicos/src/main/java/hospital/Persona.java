package hospital;

public class Persona {

	private boolean vacunado;
	private int dni;
	
	public Persona(boolean vacunado, int dni) {
		this.vacunado = vacunado;
		this.dni = dni;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
}
