package hospital;

public class Sanitario extends Persona {

	private int numEmpleado;

	public Sanitario(boolean vacunado, int dni, int numEmpleado) {
		super(vacunado, dni);
		this.numEmpleado = numEmpleado;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
}
