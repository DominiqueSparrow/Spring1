package app.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	int customerId;

	@Column(name = "NAME")
	String name;

	@Column(name = "ADDRESS")
	String address;

	@Column(name = "WEBSITE")
	String website;

	@Column(name = "CREDIT_LIMIT")
	int creditLimit;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s %s %d", customerId, name, address, website, creditLimit);
	}
}
