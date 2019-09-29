package app.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	int employeeId;

	@Column(name = "FIRST_NAME")
	String firstName;

	@Column(name = "LAST_NAME")
	String lastName;

	@Column(name = "EMAIL")
	String eMail;

	@Column(name = "PHONE")
	String phone;

	@Column(name = "HIRE_DATE")
	Date hireDate;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "MANAGER_ID")
	private Employee manager;

	// @OneToMany(mappedBy="manager")
	// private Set<Employee> subordinates = new HashSet<Employee>();

	@Column(name = "JOB_TITLE")
	String jobTitle;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public Date gethireDate() {
		return hireDate;
	}

	public void sethireDate(Date date) {
		this.hireDate = date;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		String info = String.format("(%d %s %s %s %s %s %tD %s)", employeeId, firstName, lastName, manager, eMail,
				phone, hireDate, jobTitle);
		return info;
	}
}
