package curso.java.modelo.one2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;

	@OneToMany (cascade = CascadeType.ALL, mappedBy = "autor" /*OBLIGATORIO PARA QUE ENLACE DE MANERA BIDIRECCIONAL*/ )
	private List<Libro> libros = new ArrayList<Libro>();
	
	public Autor(String nombre) {
		this.nombre = nombre;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", libros=" + libros + "]";
	}
	
//	public void setLibros(List<Libro> libros) {
//		this.libros = libros;
//		for(Libro l : libros) { // A través de set
//			l.setAutor(this);
//		}
//	}
	
//	@Override
//	public String toString() {
//		return "* Autor [id=" + id + ", nombre=" + nombre + "]";
//	}
		
}