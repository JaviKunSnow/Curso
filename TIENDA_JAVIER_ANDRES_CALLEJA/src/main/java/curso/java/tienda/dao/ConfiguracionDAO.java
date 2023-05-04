package curso.java.tienda.dao;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import curso.java.tienda.config.HibernateManager;
import curso.java.tienda.model.Configuracion;

public class ConfiguracionDAO {

	public int create(Configuracion obj) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(obj);
		tx.commit();
		session.close();
		return id;
		
	}
	
	public Configuracion get(int id) {
		Session session = HibernateManager.getSessionFactory().openSession();
		Configuracion obj = (Configuracion)session.get(Configuracion.class, id);
		session.close();
		return obj;
	}
	
}
