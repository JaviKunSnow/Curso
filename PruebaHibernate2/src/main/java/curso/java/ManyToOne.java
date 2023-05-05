package curso.java;

import java.util.ArrayList;
import java.util.List;

import curso.java.dao.many2one.CategoriaDAO;
import curso.java.dao.many2one.EnlaceDAO;
import curso.java.modelo.many2one.Categoria;
import curso.java.modelo.many2one.Enlace;

public class ManyToOne {

	public static CategoriaDAO cdao = new CategoriaDAO();
	public static EnlaceDAO edao = new EnlaceDAO();
	
	public static void main(String[] args) {
	
		Categoria c1 = new Categoria(0, "Spring");
		Categoria c2 = new Categoria(0, "HTML");
		Categoria c3 = new Categoria(0, "CSS");
		
		//TODO: hay que poner estas líneas si es Sin Cascade (Enlace)
//		cdao.create(c1);
//		cdao.create(c2);
//		cdao.create(c3);
		
		Enlace e1 = new Enlace(0, "https://spring.io/", c1);
		Enlace e2 = new Enlace(0, "https://www.w3schools.com/html/", c2);
		Enlace e3 = new Enlace(0, "https://spring.io/projects", c1);
		
		edao.create(e1);
		edao.create(e2);
		edao.create(e3);
		
		
//		List<Enlace> enlaces = edao.list("");
//System.out.println();

		for(Enlace enlace : edao.list("")) {
			System.out.println(enlace.toString());
			
//			Categoria c = enlace.getCategoria();
//			c.getNombre();
		}
				
//		for(Categoria categoria : cdao.list("")) {
//			System.out.println(categoria.toString());
//		}
		
		// Con Cascade (en Enlace): Se borra la categoría asociada pero si hay más enlaces con la misma categoría da error y NO se eliminan (se mantiene su categoria_id)
		// Sin Cascade (en Enlace): NO se borra la categoría asociada al enlace eliminado
		//edao.delete(3);

		// Al borrar una categoría NO se borran los enlaces hijos
		//cdao.delete(2);
		
		
//		for(Enlace enlace : edao.list("")) {
//			System.out.println(enlace.toString());
//		}
//		
//		for(Categoria categoria : cdao.list("")) {
//			System.out.println(categoria.toString());
//		}

		System.exit(0);
		
	}

}
