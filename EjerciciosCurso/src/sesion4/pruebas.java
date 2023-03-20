package sesion4;

import java.time.LocalTime;
import java.util.*;

public class pruebas {

	public static void main(String[] args) {
		
		Direccion direccion = new Direccion("Calle Padro", 10, 3, 'D', "Zamora", "España", 49013);
		
		String mail[] = new String[1];
		mail[0] = "paco2@gmail.com";
		Contacto contacto = new Contacto(mail, null);
		HashMap <String, Mensaje> buzonE = new HashMap<>();
		HashMap <String, Mensaje> buzonS = new HashMap<>();
		HashMap <String, Mensaje> buzonE2 = new HashMap<>();
		HashMap <String, Mensaje> buzonS2 = new HashMap<>();
		Buzon buzon1 = new Buzon(buzonE, buzonS);
		Buzon buzon2 = new Buzon(buzonE2, buzonS2);
		
		Clientes cliente1 = new Clientes("71050002Z", "Paco", "Martinez", "Sanchez", direccion, contacto, buzon1, "paco@gmail.com", 100000.1);
		Clientes cliente2 = new Clientes("71055602Z", "Pepe", "Gomez", "Sanchez", direccion, contacto, buzon2, "pepe@gmail.com", 100000.1);
		//cuentaNomina cuenta1 = new cuentaNomina(cliente1.getDni(), 122231, 122.3);
		Mensaje mensaje1 = new Mensaje(cliente1, cliente2, "Hola pepe", "2012");
		
		buzon1.llamaEnviar(buzon1, buzon2, cliente1.getNombre(), mensaje1);
		buzon1.llamaEnviar(buzon1, buzon2, cliente1.getNombre(), mensaje1);
		
		for(Map.Entry<String, Mensaje> entry : buzon1.getBuzonSalida().entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getMensaje());
		}
		
		/*
		System.out.println(cuenta1.getSaldoTotCuenta());
		cuenta1.addSaldoTotCuenta(2000.20);
		System.out.println(cuenta1.getSaldoTotCuenta());
		*/
		
		
	}
}
