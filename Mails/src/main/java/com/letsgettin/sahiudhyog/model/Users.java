package com.letsgettin.sahiudhyog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidatesearch")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    @Column(name="id")
	private Long id;
    @Column(name="name")
	private String name;
    @Column(name="skills") 
    private String skills;
    @Column(name="email")
    private String email;
    
    
    //Constructures by using fields
	public Users( long id, String name,String skills, String email) {
		super();
		
		this.id = id;
		this.name = name;
		this.skills = skills;
		this.email = email;
		
	}

	public Users() {}
	//getters & setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", skills=" + skills + ", email=" + email + "]";
	}

	
}
	
	
	