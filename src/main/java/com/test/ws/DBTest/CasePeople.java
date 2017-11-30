package com.test.ws.DBTest;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="CASE_PEOPLE")
public class CasePeople implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7504207380728096031L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String person_id;
	
    private String designation_id;
    private String name;
    private String address;
    private String phone_number;
	private String email;
//    private String username;
//    private String password;
    
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CASE_CHANNELS", 
	           joinColumns = { @JoinColumn(name = "person_id") }, 
	           inverseJoinColumns = { @JoinColumn(name = "channel_id") })
	private List<CaseChannels> caseChannels;
	
}
