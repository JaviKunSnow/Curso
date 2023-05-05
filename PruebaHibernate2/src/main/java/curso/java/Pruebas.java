package curso.java;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import curso.java.dao.many2one.CategoriaDAO;
import curso.java.dao.many2one.EnlaceDAO;
import curso.java.dao.one2many.AutorDAO;
import curso.java.dao.one2many.LibroDAO;
import curso.java.modelo.many2one.Categoria;
import curso.java.modelo.many2one.Enlace;
import curso.java.modelo.one2many.Autor;
import curso.java.modelo.one2many.Libro;

public class Pruebas {

	public static AutorDAO adao = new AutorDAO();
	public static LibroDAO ldao = new LibroDAO();
	
	public static void main(String[] args) {
	
		Autor a1 = new Autor("Fernando de Rojas");
		Autor a2 = new Autor("Francisco de Quevedo");
		Autor a3 = new Autor("Juan Ramón Jiménez");
		
		//TODO: hay que poner estas líneas si es Sin Cascade (Libro)
//		adao.create(a1);
//		adao.create(a2);
//		adao.create(a3);

//		Libro l1 = new Libro("La Celestina");
//		Libro l2 = new Libro("El Parnaso español");
//		Libro l3 = new Libro("Platero y yo");
//		Libro l4 = new Libro("Sueños y discursos");
		
		// A través de set		
//		List<Libro> lista_libros = new ArrayList<Libro>();
//		lista_libros.add(l2);
//		lista_libros.add(l4);
//		a2.setLibros(lista_libros);
		
		//l2.setAutor(a2);
		//l4.setAutor(a2);
		
		Libro l1 = new Libro("La Celestina", a1);
		Libro l2 = new Libro("El Parnaso español", a2);
		Libro l3 = new Libro("Platero y yo", a3);
		Libro l4 = new Libro("Sueños y discursos", a2);
				
		ldao.create(l1);
		ldao.create(l2);
		ldao.create(l3);
		ldao.create(l4);

//		for(Libro libro : ldao.list("")) {
//			System.out.println(libro.toString());
//		}
				
//		for(Autor autor : adao.list("")) {
//			System.out.println(autor.toString());
//		}
		
		// Con Cascade (en Autor): Se eliminan TODOS los libros asociados al autor eliminado
		// Sin Cascade (en Autor): NO se borra ningún libro asociado al autor eliminado
		//adao.delete(2);
				
		// Con Cascade (en Autor): El autor asociado también se borra JUNTO con el resto de libros del autor
		// Sin Cascade (en Autor): El autor asociado también se borra PERO el resto de libros del autor permanece
		//ldao.delete(2);
		
		for(Autor autor : adao.list("")) {
			System.out.println(autor.toString());
		}

//		for(Autor autor : adao.list("")) {
//			System.out.println("- " + autor.getNombre());
//			List<Libro> libros = autor.getLibros();
//			for(Libro libro : libros) {
//				System.out.println(libro.toString());
//			}
//		}
		
		System.exit(0);
		
	}

}
