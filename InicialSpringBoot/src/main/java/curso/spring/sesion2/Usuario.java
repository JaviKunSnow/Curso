package curso.spring.sesion2;

public class Usuario {

	private String name;
	private String pass;

	public Usuario() {
	}

	public Usuario(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", pass=" + pass + "]";
	}

}
