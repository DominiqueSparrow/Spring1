package app.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import app.data.CustomerRevenue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:WebContent/WEB-INF/spring-servlet.xml"})
public class CustomerRevenueDAOTest {
	@Autowired
	CustomerRevenueDAO cr;
	
	@Test
	public void testCustomerRevenue() {
		List<CustomerRevenue> x = cr.getAll();
		Assert.assertTrue(x.size() > 0);
		for(int i = 0;i<x.size();i++) {
			System.out.println(x.get(i));
		}
	}
}
