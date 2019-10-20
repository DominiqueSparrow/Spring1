package app.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import app.dao.CustomerDataAccessObject;
import app.dao.EmployeeDataAccessObject;
import app.data.Customer;
import app.data.CustomerRequest;

@Controller
public class HelloController {

	@Autowired
	CustomerDataAccessObject customerDAO;

	@Autowired
	EmployeeDataAccessObject employeeDAO;

	@Autowired
	CustomerRequestService customerRequestService;
	
	
	@RequestMapping("/customers")
	public ModelAndView displayCustomers() {
		return new ModelAndView("customers", "customerList", customerDAO.getAll());
	}

	@RequestMapping("/employees")
	public ModelAndView displayEmployees() {
		System.out.println("TESTESTEST");
		return new ModelAndView("employees", "employeeList", employeeDAO.getAll());
	}
	
	@RequestMapping("/customer")
	@ResponseBody

	public String singleCustomer( @RequestParam("id") String id, HttpServletRequest request) {
		System.out.println("ID :"+id);
		Customer customer = customerDAO.getById(id);
		CustomerRequest cr = new CustomerRequest();
		cr.setCustomerId(new Long(id));
		cr.setDateAndTime(new Date());
		cr.setRequestAddress(request.getRemoteHost());
		customerRequestService.saveRequest(cr);
		return (String.format("Customer with id %s is %s",id, customer));
	}

	@RequestMapping("/employeeSearch")
	public ModelAndView searchForCustomer() {
		return new ModelAndView("employeeSearch");
	}
}
