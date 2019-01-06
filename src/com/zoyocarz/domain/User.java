package com.zoyocarz.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Lob
	@Column(name="profile_pic",nullable=true,columnDefinition="longblob")
	private Byte[] profilePic;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="email")
	private String email;
	@Column(name="role",nullable=false)
	private String role;
	
	public User(Integer id, String firstName, String lastName, String username, String password, Byte[] profilePic,
			Address address, String mobileNumber, String email,String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.profilePic = profilePic;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.role = role;
	}

	public User(String firstName, String lastName, String username, String password, Byte[] profilePic, Address address,
			String mobileNumber, String email, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.profilePic = profilePic;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.role = role;
	}

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(Byte[] profilePic) {
		this.profilePic = profilePic;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
