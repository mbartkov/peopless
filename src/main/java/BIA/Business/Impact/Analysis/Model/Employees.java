package BIA.Business.Impact.Analysis.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 *
 *
 * here, In Employee model class we added the 2 new key named ReportToPerson and
 * SunEmployees and generated the getter setter method for it. Also, we updated
 * the datatype for ReportToid with int eariler it was string.
 */
@Document(collection = "Employees")
public class Employees {
	@Id

	private String id;
	private String First_name;
	private String Last_name;
	private String Designation;
	private String Responsibility;
	private String Email;
	private int PhoneNo;
	private String Address;
	private String ReportToid;
	private String ReportToPerson;
	private List<Employees> SubEmployees;
	private String Password;
	private Role Role;

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getResponsibility() {
		return Responsibility;
	}

	public void setResponsibility(String responsibility) {
		Responsibility = responsibility;
	}

	public String getReportToid() {
		return ReportToid;
	}

	public void setReportToid(String reportToid) {
		ReportToid = reportToid;
	}

	public String getReportToPerson() {
		return ReportToPerson;
	}

	public void setReportToPerson(String reportToPerson) {
		ReportToPerson = reportToPerson;
	}

	public List<Employees> getSubEmployees() {
		return SubEmployees;
	}

	public void setSubEmployees(List<Employees> subEmployees) {
		SubEmployees = subEmployees;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public BIA.Business.Impact.Analysis.Model.Role getRole() {
		return Role;
	}

	public void setRole(BIA.Business.Impact.Analysis.Model.Role role) {
		Role = role;
	}
}
