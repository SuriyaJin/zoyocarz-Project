package com.zoyocarz.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="district")
public class District implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@ManyToOne
	@JoinColumn(name="state_id",nullable=false)
	private State state;
	
	public District(String name, State state) {
		super();
		this.name = name;
		this.state = state;
	}

	public District() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
