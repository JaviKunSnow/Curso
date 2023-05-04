package accesohibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import accesohibernate.modelo.Album;

// Esta clase implementa el acceso a hibernate para las operaciones basicas CRUD (añadir, consultar, ...)
// Dentro de ella se ha creado una clase Album.
// La base de datos debe estar ejecutandose
public class AlbumDAO {

	//INSERT
	public static void anadir_album(Album a) {
		anadir_album(a.getId(), a.getTitulo(), a.getAutor());
	}
	
	// Añade un objeto nuevo a la base de datos (persistencia)
	public static void anadir_album(int id, String tit, String aut) {
		//Transaction tx = null;
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction(); // Se crea una transaccion
		Album a = null;
		if(id == 0) {
			a = new Album(tit, aut);
		}
		else {
			a = new Album(id, tit, aut);
		}
		//Album a = new Album();
		//a.setAutor(aut);
		//a.setTitulo(tit);
		//a.setId(id);
		int i = (int)session.save(a);// Guarda el objeto creado en la BBDD.
		System.out.println("Album creado con el id: " + i);
		tx.commit(); // Materializa la transaccion
		session.close();
	}

	//SELECT
	// Recupera un objeto cuyo id se pasa como parametro
	public static Album recuperar_album(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		session.beginTransaction();
		Album a = (Album) session.get(Album.class, id);
		if(a == null) {
			System.out.println("No existe el album");
		}
		else {
			System.out.println("Autor: " + a.getAutor());
		}
		session.close();
		return a;
	}
	
	//UPDATE
	public static void modificar_album(Album a) {
		modificar_album(a.getId(), a.getTitulo(), a.getAutor());
	}
	
	// Modifica un objeto cuyo id se pasa como parametro
	public static void modificar_album(int id, String tit, String aut) {
		Session session = HibernateManager.getSessionFactory().openSession();
		session.beginTransaction();
		Album a = recuperar_album(id);//new Album(id);
		if(a == null) {
			System.out.println("No existe el album");
		}
		else {
			//a.setId(id);
			a.setTitulo(tit);
			a.setAutor(aut);
			session.update(a);// Modifica el objeto con Id indicado
			session.getTransaction().commit(); // Materializa la transaccion
		} 
		session.close();
	}

	// Borrar un objeto cuyo id se pasa como parametro
	public static void borrar_album(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		session.beginTransaction();
		Album a = recuperar_album(id);//new Album(id);
		if(a == null) {
			System.out.println("No existe el album");
		}
		else {
			session.delete(a);
			System.out.println("Objeto borrado");
			session.getTransaction().commit(); // Materializa la transaccion
		}
		session.close();
	}

	// Ejecuta una consulta cuando el resultado se devuelve como un objeto Album
	public static void consulta(String c) {
		Session session = HibernateManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(c);
		List<Album> results = q.list();

		for(Album album : results) {
			System.out.println(" - " + album.getTitulo() + ": " + album.getAutor());
		}
		session.close();
	}

	// Ejecuta una consulta cuando el resultado se devuelve como String
	public static void consulta2(String c) { 
		Session session = HibernateManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(c);
		List<String> results = q.list();

		for(String cadena : results) {
			System.out.println(" - " + cadena);
		}
		session.close();
	}
	
	// Ejecuta una consulta cuando el resultado se devuelve como Array de Objetos de los campos consultados
	public static void consulta3(String c) { 
		Session session = HibernateManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery(c);
		List<Object[]> results = q.list();

		for(Object[] cadena : results) {
			System.out.println(" - " + cadena[0].toString() + ": " + cadena[1].toString());
		}
		session.close();
	}

}
