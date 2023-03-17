package sesion4;

public class Clientes extends Persona {

	private String mail;
	private Double saldo_total;
	
	public Clientes(String dni, String nombre, String apellido1, String apellido2, Direccion direccion , Contacto contacto, String mail, Double saldo_total) {
		super(dni, nombre, apellido1, apellido2, direccion, contacto);
		this.mail = mail;
		this.saldo_total = saldo_total;
	}

	public String getDni() {
		// TODO Auto-generated method stub
		return super.getDni();
	}

	@Override
	public void setDni(String dni) {
		// TODO Auto-generated method stub
		super.setDni(dni);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String getApellido1() {
		// TODO Auto-generated method stub
		return super.getApellido1();
	}

	@Override
	public void setApellido1(String apellido1) {
		// TODO Auto-generated method stub
		super.setApellido1(apellido1);
	}

	@Override
	public String getApellido2() {
		// TODO Auto-generated method stub
		return super.getApellido2();
	}

	@Override
	public void setApellido2(String apellido2) {
		// TODO Auto-generated method stub
		super.setApellido2(apellido2);
	}

	@Override
	public Direccion getDireccion() {
		// TODO Auto-generated method stub
		return super.getDireccion();
	}

	@Override
	public void setDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		super.setDireccion(direccion);
	}

	@Override
	public Contacto getContacto() {
		// TODO Auto-generated method stub
		return super.getContacto();
	}

	@Override
	public void setContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		super.setContacto(contacto);
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
