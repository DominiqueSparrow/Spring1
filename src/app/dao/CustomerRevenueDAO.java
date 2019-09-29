package app.dao;

import org.springframework.stereotype.Component;

import app.data.CustomerRevenue;

@Component
public class CustomerRevenueDAO extends AbsractDAO<CustomerRevenue> implements IDataAccessObject<CustomerRevenue> {

	public CustomerRevenueDAO() {
		super(CustomerRevenue.class);
	}


}
