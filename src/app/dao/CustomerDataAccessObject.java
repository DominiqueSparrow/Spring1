package app.dao;

import org.springframework.stereotype.Component;

import app.data.Customer;

@Component
public class CustomerDataAccessObject extends AbsractDAO<Customer> implements IDataAccessObject<Customer> {

	public CustomerDataAccessObject() {
		super(Customer.class);
	}


}
