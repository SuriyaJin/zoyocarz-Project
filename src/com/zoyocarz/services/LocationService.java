package com.zoyocarz.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zoyocarz.domain.State;
import com.zoyocarz.domain.District;

@Service("locationService")
@Transactional
public class LocationService {
	
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveState(String stateName, String districtName) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		State stateIns = obtainStateByName(stateName);
		if(stateIns == null) {
			 stateIns = new State();
			 stateIns.setName(stateName);
			 session.save(stateIns);
		}
		District districtIns = obtainDistrictByName(districtName);
		if(districtIns == null) {
			districtIns = new District(districtName, stateIns);
			session.save(districtIns);
			stateIns.getDistricts().add(districtIns);
			session.save(stateIns);
		}
		tx.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<State> obtainAllStates() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<State> stateList = session.createCriteria(State.class).list();
		tx.commit();
		session.close();
		return stateList;
	}
	
	@SuppressWarnings("unchecked")
	public District obtainDistrictByName(String name) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<District> districtList = session.createCriteria(District.class).add(Restrictions.eq("name", name)).list();
		tx.commit();
		session.close();
		return districtList.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public State obtainStateByName(String name) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<State> stateList = session.createCriteria(State.class).add(Restrictions.eq("name", name)).list();
		tx.commit();
		session.close();
		return stateList.get(0);
	}
}
