package hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static boolean flag = false;
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Medico medico1 = new Medico(false, 124353, 1);
		Medico medico2 = new Medico(false, 122223, 2);
		
		Enfermera enfermera1 = new Enfermera(false, 223244, 1);
		Enfermera enfermera2 = new Enfermera(false, 223344, 1);
		
		/*Paciente paciente12 = new Paciente(false, 213323, null);
		Paciente paciente2 = new Paciente(false, 21223, null);
		Paciente paciente3 = new Paciente(false, 213567, null);
		Paciente paciente4 = new Paciente(false, 213879, null);
		Paciente paciente5 = new Paciente(false, 213879, null);*/
		
		ArrayList <Persona> medicos = new ArrayList<>();
		ArrayList <Persona> pacientes = new ArrayList<>();
		ArrayList <Persona> enfermeras = new ArrayList<>();
		/*pacientes.add(paciente1);
		pacientes.add(paciente2);
		pacientes.add(paciente3);
		pacientes.add(paciente4);
		pacientes.add(paciente5);*/
		
		Centro centro = new Centro(medicos, enfermeras, pacientes);
		
		
		do {
			
			System.out.println("1. Insertar registros de pacientes");
			System.out.println("2. lista de pacientes");
			System.out.println("3. salir");
			System.out.println("-------------");
			System.out.println("Dime una opcion:");
			int opc = teclado.nextInt();
			
			switch(opc) {
			case 1:
				hilo1 hilo1 = new hilo1(centro);
				hilo1.start();
				break;
			case 2:
				hilo2 hilo2 = new hilo2(enfermera1, medico1, centro);
				hilo2.start();
				break;
			case 3:
				flag = true;
				break;
			default:
				System.out.println("No has elegido ninguna opcion.");
				break;
			}
			
		} while(!flag);
		
		
	}

}
