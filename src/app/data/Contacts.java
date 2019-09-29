package app.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACTS")

public class Contacts {
	@Id
	@Column(name = "CONTACT_ID")
	int contactId;
	@Column(name = "FIRST_NAME")
	String firstName;
	@Column(name = "LAST_NAME")
	String lastName;
	@Column(name = "EMAIL")
	String eMail;
	@Column(name = "PHONE")
	String phone;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	Customer customer;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Customer getCustomerId() {
		return customer;
	}

	public void setCustomerId(Customer customerId) {
		this.customer = customerId;
	}

	@Override
	public String toString() {
		return String.format("Contact: (%d %s %s %s %s Customer: (%s))", contactId, firstName, lastName, eMail, phone,
				customer);
	}

}
