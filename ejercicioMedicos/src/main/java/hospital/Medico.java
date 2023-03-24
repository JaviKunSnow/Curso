package hospital;

import java.util.ArrayList;

public class Medico extends Sanitario implements operacionesMedico {
	
	public Medico(boolean vacunado, int dni, int numEmpleado) {
		super(vacunado, dni, numEmpleado);
	}
	
	public ArrayList pasarConsultaMedico(ArrayList<Persona> pacientes) {
		return pasarConsulta(pacientes, this);
	}

}
