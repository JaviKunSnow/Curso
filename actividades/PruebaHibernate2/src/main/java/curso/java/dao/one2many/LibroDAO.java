package curso.java.dao.one2many;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import curso.java.hibernate.HibernateManager;
import curso.java.modelo.one2many.Libro;

public class LibroDAO {
	
	public int create(Libro obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(obj);
		tx.commit();
		session.close();
		return id;
	}

	public void update(Libro obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}
	
	public void delete(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Libro obj = get(id);
		session.delete(obj);
		tx.commit();
		session.close();
	}

	public Libro get(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Libro obj = (Libro)session.get(Libro.class, id);
		session.close();
		return obj;
	}

	public List<Libro> list(String query) {
		if(query.equals("")) {
			query = "FROM Libro";
		}
		Session session = HibernateManager.getSessionFactory().openSession();
		List<Libro> objs = null;
		try {
			objs = (List<Libro>)session.createQuery(query).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return objs;
	}

}
