package com.zoyocarz.domain;

import java.io.Serializable;

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
	
	public State() {
		super();
	}

	public State(String name) {
		super();
		this.name = name;
	}

	public State(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
