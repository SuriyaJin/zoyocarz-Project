package com.zoyocarz.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zoyocarz.domain.District;
import com.zoyocarz.domain.Vehicle;

@Service("vehicleService")
@Transactional
public class VehicleService {
	
	public SessionFactory sessionFactory;
	
	@Autowired
	public ApplicationContext appContext;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveVehicle(String name, Double pricePerKm, Byte[] image, String districtName, String vehicleNo) {
		LocationService locationService = (LocationService) appContext.getBean("locationService");
		District district = locationService.obtainDistrictByName(districtName);
		Vehicle vehicleIns = new Vehicle(districtName, pricePerKm, image, district, vehicleNo);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(vehicleIns);
		tx.commit();
		session.close();
	}
}
