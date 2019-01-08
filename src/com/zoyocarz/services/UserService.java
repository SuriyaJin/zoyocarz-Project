package com.zoyocarz.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zoyocarz.domain.Address;
import com.zoyocarz.domain.User;

@Service("userService")
@Transactional
public class UserService {
	
	public SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void createUser(String firstName,String lastName,String password,String mobileNumber,String email,String street,String city,String state,String pincode) {
		Address addressIns = new Address(street, city, state, pincode);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(addressIns);
		User userIns = new User();
		userIns.setFirstName(firstName);
		userIns.setLastName(lastName);
		userIns.setPassword(password);
		userIns.setMobileNumber(mobileNumber);
		userIns.setEmail(email);
		userIns.setAddress(addressIns);
		userIns.setRole("client");
		session.save(userIns);
		tx.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public Boolean login(String username, String password) {
		Boolean valid = false;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<User> userList = session.createCriteria(User.class).add(Restrictions.eq("email",username)).list();
		if(userList.size() > 0) {
			if(userList.get(0).getPassword().equals(password)) {
				valid = true;
			}
		}
		tx.commit();
		session.close();
		return valid;
	}
}
