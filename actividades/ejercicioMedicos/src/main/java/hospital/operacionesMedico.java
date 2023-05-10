package hospital;

import java.util.ArrayList;

public interface operacionesMedico {

	default ArrayList pasarConsulta(ArrayList <Persona> pacientes, Medico medico) {
		ArrayList <Persona> vacunacion = new ArrayList<>();
		for(int i = 0; i < pacientes.size(); i++) {
			if(i % 2 == 0) {
				vacunacion.add(pacientes.get(i));	
			}
		}
		vacunacion.add(medico);
		return vacunacion;
	}
	
}
