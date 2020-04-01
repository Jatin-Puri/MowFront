package com.niit.fooddemo.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.*;



@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="password")
	
	private String password;
	
	@Column(name="address")
	private String address;
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name="phone")
	private String phone;
	
	
	
	public Customer() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPassword() {
		return password;
		
	}
	public void setPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = password;
		String encodedString = encoder.encodeToString(
		normalString.getBytes(StandardCharsets.UTF_8) );
		this.password = encodedString;
		
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", password=" + password + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
}
