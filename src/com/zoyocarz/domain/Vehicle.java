package com.zoyocarz.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="vehicle")
public class Vehicle implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="price_per_km")
	private Double pricePerKm;
	@Lob
	@Column(name="image",nullable=false,columnDefinition="longblob")
	private Byte[] image;
	@OneToOne(cascade=CascadeType.ALL)
	private District district;
	@Column(name="vehicle_no")
	private String vehicleNo;
	
	public Vehicle(Integer id, String name, Double pricePerKm, Byte[] image, District district, String vehicleNo) {
		super();
		this.id = id;
		this.name = name;
		this.pricePerKm = pricePerKm;
		this.image = image;
		this.district = district;
		this.vehicleNo = vehicleNo;
	}

	public Vehicle(String name, Double pricePerKm, Byte[] image, District district, String vehicleNo) {
		super();
		this.name = name;
		this.pricePerKm = pricePerKm;
		this.image = image;
		this.district = district;
		this.vehicleNo = vehicleNo;
	}

	public Vehicle() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPricePerKm() {
		return pricePerKm;
	}

	public void setPricePerKm(Double pricePerKm) {
		this.pricePerKm = pricePerKm;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
}
