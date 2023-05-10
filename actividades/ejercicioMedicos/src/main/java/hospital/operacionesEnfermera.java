package hospital;

import java.util.ArrayList;

public interface operacionesEnfermera {

	default void vacunar(ArrayList<Persona> personas) {
		for(Persona paciente : personas) {
			if(!paciente.isVacunado()) {
				vacunar(paciente);
			}
		}
	}
	
	default void vacunar(Persona persona) {
		persona.setVacunado(true);
		System.out.println("Se ha vacunado a paciente con DNI: " + persona.getDni());
	}
	
}
