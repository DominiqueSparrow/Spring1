package app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.data.Customer;
import app.data.Employee;

@Component
public class EmployeeDataAccessObject implements IDataAccessObject<Employee> {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Employee> getAll() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		session.getTransaction().commit();
		session.close();
		return empList;
	}

}
