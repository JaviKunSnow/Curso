package hospital;

import java.util.ArrayList;
import java.util.List;

public class Centro {

	ArrayList<Persona> medicos = new ArrayList<>();
	ArrayList<Persona> enfermeras = new ArrayList<>();
	ArrayList<Persona> pacientes = new ArrayList<>();
	
	public Centro(ArrayList<Persona> medicos2, ArrayList<Persona> pacientes2, ArrayList<Persona> pacientes) {
		super();
		this.medicos = medicos2;
		this.enfermeras = pacientes2;
		this.pacientes = pacientes;
	}

	public ArrayList<Persona> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Persona> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Persona> getEnfermeras() {
		return enfermeras;
	}

	public void setEnfermeras(ArrayList<Persona> enfermeras) {
		this.enfermeras = enfermeras;
	}

	public ArrayList<Persona> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Persona> pacientes) {
		this.pacientes = pacientes;
	}
	
	
}
