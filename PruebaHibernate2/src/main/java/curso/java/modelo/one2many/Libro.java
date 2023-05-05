package curso.java.modelo.one2many;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
		
	@ManyToOne (cascade = CascadeType.ALL)
	//@JoinColumn (name = "autor_id")
	private Autor autor;

	public Libro(String titulo) {
		this.titulo = titulo;
	}
	
	public Libro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

//	@Override
//	public String toString() {
//		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + "]";
//	}

	@Override
	public String toString() {
		return "* Libro [id=" + id + ", titulo=" + titulo + "]";
	}
		
}