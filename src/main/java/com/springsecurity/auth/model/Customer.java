package com.springsecurity.auth.model;

import javax.persistence.*;

@Entity
@Table (name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column (nullable = false, unique = true, length = 40)
	private String email;
	
	@Column (nullable = false, length = 10)
	private String password; 
	
	@Column (nullable = false, length = 30)
	private String fullName;
	
	public Customer () {
		
	}

	public Customer(Integer id, String email, String password, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", password=" + password + ", fullName=" + fullName + "]";
	}
	
	
}
