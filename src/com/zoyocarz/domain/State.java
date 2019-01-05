package com.zoyocarz.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="state")
public class State implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="state_id")
	private Integer id;
	@Column(name="name")
	private String name;
	@OneToMany(mappedBy="state")
	private Set<District> districts;
	
	public State() {
		super();
	}

	public State(String name,Set<District> districts) {
		super();
		this.name = name;
		this.districts = districts;
	}

	public State(Integer id, String name,Set<District> districts) {
		super();
		this.id = id;
		this.name = name;
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<District> getDistricts() {
		return districts;
	}

	public void setDistricts(Set<District> districts) {
		this.districts = districts;
	}
	
}
