package hospital;

import java.util.HashMap;

public class Paciente extends Persona {

	HashMap <Integer, String> historial;

	public Paciente(boolean vacunado, int dni, HashMap<Integer, String> historial) {
		super(vacunado, dni);
		this.historial = historial;
	}

	public HashMap<Integer, String> getHistorial() {
		return historial;
	}	
	
}
