package com.example.demo.dto;



public class Userdto {
	private long id;

    private String firstName;


    private String lastName;

    private String email;


    private String contactNumber;


    private String password;

    private String roles;


    private String active;

    private String gender;


    private String dateOfBirth;

    private String address;

	@Override
	public String toString() {
		return "Userdto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contactNumber=" + contactNumber + ", password=" + password + ", roles=" + roles + ", active="
				+ active + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}

	public Userdto(long id, String firstName, String lastName, String email, String contactNumber, String password,
			String roles, String active, String gender, String dateOfBirth, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.password = password;
		this.roles = roles;
		this.active = active;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Userdto() {
		super();
	}
    

}
