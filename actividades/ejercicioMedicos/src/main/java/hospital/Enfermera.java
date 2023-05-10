package hospital;

import java.util.ArrayList;

public class Enfermera extends Sanitario implements operacionesEnfermera{

	public Enfermera(boolean vacunado, int dni, int numEmpleado) {
		super(vacunado, dni, numEmpleado);
	}

	public void vacunarPacientes(ArrayList<Persona> personas) {
		vacunar(personas);
	}
	
}
