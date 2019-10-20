package app.dao;

import app.data.CustomerRequest;

public class CustomerRequestDao extends AbsractDAO<CustomerRequest> implements IDataAccessObject<CustomerRequest>{

	public CustomerRequestDao() {
		super(CustomerRequest.class);
	}
	

}
