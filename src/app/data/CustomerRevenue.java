package app.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_revenues")
public class CustomerRevenue {
	@Id
	@Column(name = "customer_id")
	int customerId;
	
	@Column(name = "customer_name")
	String name;
	
	@Column (name="customer_revenue")
	double revenue;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return String.format("CustomerRevenue(%d, %s, %f)", customerId, name, revenue);
	}
}
