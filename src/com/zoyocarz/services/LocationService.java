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
		State stateIns = obtainStateByName(stateName);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		if(stateIns == null) {
			 stateIns = new State();
			 stateIns.setName(stateName);
			 session.save(stateIns);
		}
		District districtIns = obtainDistrictByName(districtName);
		if(districtIns == null) {
			districtIns = new District(districtName, stateIns);
			session.save(districtIns);
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
		District district = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<District> districtList = session.createCriteria(District.class).add(Restrictions.eq("name", name)).list();
		tx.commit();
		session.close();
		if(districtList.size() > 0) {
			district = districtList.get(0);
		}
		return district;
	}
	
	@SuppressWarnings("unchecked")
	public State obtainStateByName(String name) {
		State state = null;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<State> stateList = session.createCriteria(State.class).add(Restrictions.eq("name", name)).list();
		tx.commit();
		session.close();
		if(stateList.size() > 0) {
			state = stateList.get(0);
		}
		return state;
	}
	
	@SuppressWarnings("unchecked")
	public List<District> obtainAllDistricts() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<District> districtList = session.createCriteria(District.class).list();
		tx.commit();
		session.close();
		return districtList;
	}
}
