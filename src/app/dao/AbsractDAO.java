package app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbsractDAO<T> {
	
	@Autowired
	SessionFactory sessionFactory;
	
	Class<T> clazz;
	
	public AbsractDAO(Class<T> cl){
		this.clazz = cl;
	}
	
	public List<T> getAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<T> empList = session.createQuery("from "+clazz.getName()).list();
		session.getTransaction().commit();
		session.close();
		return empList;
	}
}
