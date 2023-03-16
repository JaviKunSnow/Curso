package sesion4;

public class pruebas {

	public static void main(String[] args) {
		
		Direccion direccion = new Direccion("Calle Padro", 10, 3, 'D', "Zamora", "España", 49013);
		
		String mail[] = new String[1];
		mail[0] = "paco2@gmail.com";
		Contacto contacto = new Contacto(mail, null);
		
		Clientes cliente1 = new Clientes("71050002Z", "Paco", "Martinez", "Sanchez", direccion, contacto, "paco@gmail.com", 100000.1);
		Cuenta cuenta1 = new Cuenta(cliente1.getDni(), 122231, 122313.3);
		
		System.out.println(cuenta1.getDni());
		
	}
}
