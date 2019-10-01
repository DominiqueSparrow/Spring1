package app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbsractDAO<DataTypeT> {
	
	@Autowired
	SessionFactory sessionFactory;
	
	Class<DataTypeT> clazz;
	
	public AbsractDAO(Class<DataTypeT> cl){
		this.clazz = cl;
	}
	
	@SuppressWarnings("unchecked")
	public List<DataTypeT> getAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<DataTypeT> empList = session.createQuery("from "+clazz.getName()).list();
		session.getTransaction().commit();
		session.close();
		return empList;
	}
	
	@SuppressWarnings("unchecked")
	public DataTypeT getById(String id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String idFieldName = sessionFactory.getClassMetadata(clazz).getIdentifierPropertyName();
		String typeName = clazz.getName();
		String queryString = String.format("from %s where %s = %s",typeName, idFieldName, id);
		DataTypeT item = (DataTypeT) session.createQuery(queryString).list().get(0);
		session.getTransaction().commit();
		session.close();
		return item;
		
	}
}
