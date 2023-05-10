package curso.java;

import java.util.List;

import curso.java.dao.one2many.AutorDAO;
import curso.java.dao.one2many.LibroDAO;
import curso.java.modelo.one2many.Autor;
import curso.java.modelo.one2many.Libro;

public class OneToMany {

	public static AutorDAO adao = new AutorDAO();
	public static LibroDAO ldao = new LibroDAO();
	
	public static void main(String[] args) {
		//cargarDatos();
		
		for(Autor autor : adao.list("")) {
			System.out.println("- " + autor.getNombre());
			List<Libro> libros = autor.getLibros();
			for(Libro libro : libros) {
				System.out.println(libro.toString());
			}
		}
	}
	
	public static void cargarDatos() {
	
		Autor a1 = new Autor("Fernando de Rojas");
		Autor a2 = new Autor("Francisco de Quevedo");
		Autor a3 = new Autor("Juan Ramón Jiménez");
		
		//TODO: hay que poner estas líneas si es Sin Cascade (Libro)
//		adao.create(a1);
//		adao.create(a2);
//		adao.create(a3);
		
		Libro l1 = new Libro("La Celestina", a1);
		Libro l2 = new Libro("El Parnaso español", a2);
		Libro l3 = new Libro("Platero y yo", a3);
		Libro l4 = new Libro("Sueños y discursos", a2);
				
		ldao.create(l1);
		ldao.create(l2);
		ldao.create(l3);
		ldao.create(l4);
	}
}
