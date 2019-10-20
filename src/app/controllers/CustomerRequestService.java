package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.CustomerRequestDao;
import app.data.CustomerRequest;

@Service
public class CustomerRequestService {
	
	@Autowired
	CustomerRequestDao crDAO;
	
	public void saveRequest(CustomerRequest cr) {
		crDAO.save(cr);
	}
	
}
