package com.juan.license.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="licenses")
public class License {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String person;
	private String state;
	private int expDate;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	public License() {
	}


	public License(Long id, String person, String state, int expDate) {
		this.id = id;
		this.person = person;
		this.state = state;
		this.expDate = expDate;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPerson() {
		return person;
	}


	public void setPerson(String person) {
		this.person = person;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getExpDate() {
		return expDate;
	}


	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}
	
	
	
	
}
