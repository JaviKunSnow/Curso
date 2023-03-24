package hospital;


import java.util.ArrayList;

public class hilo2 extends Thread {

	Enfermera enfermera;
	Medico medico;
	Centro centro;
	ArrayList <Persona> vacunacion;

	public hilo2(Enfermera enfermera, Medico medico, Centro centro) {
		super();
		this.enfermera = enfermera;
		this.medico = medico;
		this.centro = centro;
	}

	public void run() {
		while(!main.flag) {
			vacunacion = medico.pasarConsultaMedico(centro.getPacientes());
			enfermera.vacunarPacientes(vacunacion);
			System.out.println("Paciente vacunados");
			try {
				sleep(20000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
}
