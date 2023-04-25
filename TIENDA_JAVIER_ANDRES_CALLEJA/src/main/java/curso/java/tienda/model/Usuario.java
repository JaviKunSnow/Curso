package curso.java.tienda.model;

public class Usuario {

	private int id;
	private int id_rol;
	private String email;
	private String clave;
	private String nombre;
	private String apellidos;
	private boolean baja;
	
	public Usuario() {
		
	}

	public Usuario(int id, int id_rol, String email, String clave, String nombre, String apellidos, boolean baja) {
		super();
		this.id = id;
		this.id_rol = id_rol;
		this.email = email;
		this.clave = clave;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.baja = baja;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean getBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}
	
}
