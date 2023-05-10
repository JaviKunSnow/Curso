package sesion4;

public class Clientes extends Persona {

	private String mail;
	private Double saldo_total;
	
	public Clientes(String dni, String nombre, String apellido1, String apellido2, Direccion direccion , Contacto contacto, Buzon buzon, String mail, Double saldo_total) {
		super(dni, nombre, apellido1, apellido2, direccion, contacto, buzon);
		this.mail = mail;
		this.saldo_total = saldo_total;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Double getSaldo_total() {
		return saldo_total;
	}

	public void setSaldo_total(Double saldo_total) {
		this.saldo_total = saldo_total;
	}

	
	

}
