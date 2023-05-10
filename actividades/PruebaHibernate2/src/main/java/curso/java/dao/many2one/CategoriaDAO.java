package curso.java.dao.many2one;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import curso.java.hibernate.HibernateManager;
import curso.java.modelo.many2one.Categoria;

public class CategoriaDAO {
	
	public int create(Categoria obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(obj);
		tx.commit();
		session.close();
		return id;
	}

	public void update(Categoria obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}
	
	public void delete(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Categoria obj = get(id);
		session.delete(obj);
		tx.commit();
		session.close();
	}

	public Categoria get(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Categoria obj = (Categoria)session.get(Categoria.class, id);
		session.close();
		return obj;
	}

	public List<Categoria> list(String query) {
		if(query.equals("")) {
			query = "FROM Categoria";
		}
		Session session = HibernateManager.getSessionFactory().openSession();
		List<Categoria> objs = null;
		try {
			objs = (List<Categoria>)session.createQuery(query).list();
		} catch (HibernateException e) {
			e.printStackTrace();
			//session.getTransaction().rollback();
		}
		return objs;
	}
	
	public Categoria get(String query) {
		String email = "prueba@tienda.es";
		query = "FROM Categoria WHERE email='" + email +"'";
		Session session = HibernateManager.getSessionFactory().openSession();
		Categoria obj = (Categoria)session.createQuery(query).uniqueResult();
		return obj;
	}
	
	public List<Categoria> list() {
		return list("");
	}
}
