package accesohibernate.modelo;

public class Album {

	private int id;
	private String titulo;
	private String autor;

	public Album() {
	}

	public Album(int id) {
		this.id = id;
	}

	public Album(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Album(int id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	@Override
	public String toString() {
		return "Album [id=" + id + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}
