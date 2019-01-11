package com.zoyocarz.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zoyocarz.domain.District;
import com.zoyocarz.domain.Vehicle;

@Service("vehicleService")
@Transactional
public class VehicleService {
	
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveVehicle(String name, Double pricePerKm, byte[] image, Integer districtId, String vehicleNo) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		District district = (District) session.get(District.class,districtId);
		Vehicle vehicleIns = new Vehicle(name, pricePerKm, image, district, vehicleNo);
		session.save(vehicleIns);
		tx.commit();
		session.close();
	}
}
