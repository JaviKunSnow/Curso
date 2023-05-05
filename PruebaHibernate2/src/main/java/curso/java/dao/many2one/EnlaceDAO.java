package curso.java.dao.many2one;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import curso.java.hibernate.HibernateManager;
import curso.java.modelo.many2one.Enlace;

public class EnlaceDAO {
	
	public int create(Enlace obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(obj);
		tx.commit();
		session.close();
		return id;
	}

	public void update(Enlace obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}
	
	public void delete(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Enlace obj = get(id);
		session.delete(obj);
		tx.commit();
		session.close();
	}

	public Enlace get(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Enlace obj = (Enlace)session.get(Enlace.class, id);
		session.close();
		return obj;
	}

	public List<Enlace> list(String query) {
		if(query.equals("")) {
			query = "FROM Enlace";
		}
		Session session = HibernateManager.getSessionFactory().openSession();
		List<Enlace> objs = null;
		try {
			objs = (List<Enlace>)session.createQuery(query).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return objs;
	}

}
