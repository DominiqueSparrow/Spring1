package app.dao;

import org.springframework.stereotype.Component;

import app.data.Employee;

@Component
public class EmployeeDataAccessObject extends AbsractDAO<Employee> implements IDataAccessObject<Employee> {

	public EmployeeDataAccessObject() {
		super(Employee.class);
	}



}
