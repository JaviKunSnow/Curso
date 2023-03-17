package sesion4;

public class pruebas {

	public static void main(String[] args) {
		
		Direccion direccion = new Direccion("Calle Padro", 10, 3, 'D', "Zamora", "España", 49013);
		
		String mail[] = new String[1];
		mail[0] = "paco2@gmail.com";
		Contacto contacto = new Contacto(mail, null);
		
		Clientes cliente1 = new Clientes("71050002Z", "Paco", "Martinez", "Sanchez", direccion, contacto, "paco@gmail.com", 100000.1);
		cuentaNomina cuenta1 = new cuentaNomina(cliente1.getDni(), 122231, 122.3);
		
		System.out.println(cuenta1.getSaldoTotCuenta());
		
		cuenta1.addSaldoTotCuenta(2000.20);
		System.out.println(cuenta1.getSaldoTotCuenta());
		
	}
}
