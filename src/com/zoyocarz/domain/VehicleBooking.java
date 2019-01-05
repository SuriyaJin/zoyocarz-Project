package com.zoyocarz.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="vehicle_booking")
public class VehicleBooking implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@OneToOne(cascade=CascadeType.ALL)
	private User bookedBy;
	@OneToOne(cascade=CascadeType.ALL)
	private Vehicle vehicle;
	@Column(name="start_date")
	private Date startDate;
	@Column(name="end_date")
	private Date endDate;
	
	public VehicleBooking(Integer id, User bookedBy, Vehicle vehicle, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.bookedBy = bookedBy;
		this.vehicle = vehicle;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public VehicleBooking(User bookedBy, Vehicle vehicle, Date startDate, Date endDate) {
		super();
		this.bookedBy = bookedBy;
		this.vehicle = vehicle;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public VehicleBooking() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(User bookedBy) {
		this.bookedBy = bookedBy;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
