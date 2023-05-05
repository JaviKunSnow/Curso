package curso.java.dao.one2many;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import curso.java.hibernate.HibernateManager;
import curso.java.modelo.one2many.Autor;

public class AutorDAO {
	
	public int create(Autor obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(obj);
		tx.commit();
		session.close();
		return id;
	}

	public void update(Autor obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}
	
	public void delete(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Autor obj = get(id);
		session.delete(obj);
		tx.commit();
		session.close();
	}

	public Autor get(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Autor obj = (Autor)session.get(Autor.class, id);
		session.close();
		return obj;
	}

	public List<Autor> list(String query) {
		if(query.equals("")) {
			query = "FROM Autor";
		}
		Session session = HibernateManager.getSessionFactory().openSession();
		List<Autor> objs = null;
		try {
			objs = (List<Autor>)session.createQuery(query).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return objs;
	}

}
