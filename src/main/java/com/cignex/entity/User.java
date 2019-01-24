package com.cignex.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cignex.constant.Constant;



@Entity
@Table(name = Constant.USER_TABLE_NAME)
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = Constant.USER_ID)
	private int id;
	@Column(name = Constant.USER_FIRST_NAME)
	private String firstName;
	@Column(name = Constant.USER_LAST_NAME)
	private String lastName;
	@Column(name = Constant.USER_EMAIL)
	private String email;
	@Column(name = Constant.USER_ADDRESS)
	private String address;
	@Column(name = Constant.USER_MOBILE)
	private String mobile;
	@Column(name = Constant.USER_GENDER)
	private String gender;
	@Column(name = Constant.USER_PROFILE)
	private String profile;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public User(int id, String firstName, String lastName, String email, String address, String mobile, String gender,
			String profile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.gender = gender;
		this.profile = profile;
	}
	public User() {
	}
	
}
