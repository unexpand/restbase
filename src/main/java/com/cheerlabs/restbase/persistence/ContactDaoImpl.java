package com.cheerlabs.restbase.persistence;

import java.util.Collection;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cheerlabs.restbase.core.Contact;
import com.cheerlabs.restbase.core.ContactAttrs;

@Repository
public class ContactDaoImpl implements ContactDao {
	
	@PersistenceContext
	    private EntityManager entityManager;
	 
	 @Transactional
	public Contact findContactByName(String contactName) {
		 System.out.println(entityManager.find(Contact.class, contactName));
		return entityManager.find(Contact.class, contactName);
	}

	@Override
	public Contact findContactById(long id) {
		System.out.print("***findContactById**************");
		return entityManager.find(Contact.class, id);
	}

	@Override
	public Contact findContactByEmail(String email) {
		// TODO Auto-generated method stub
		return entityManager.find(Contact.class, email);
	}

	@Override
	public Contact findContactByPhone(String phone) {
		// TODO Auto-generated method stub
		return entityManager.find(Contact.class, phone);
	}

/*	@Override
	public Contact findContactByAttribute(ContactAttrs attribute, Object value) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void addUpdateContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Contact> findAllContacts() {
		Query query = entityManager.createQuery(" from Contact");
		Collection<Contact> contact = (Collection<Contact>) query.getResultList();
		return contact;
	}

	/*@Override
	public Collection<Contact> findContactsOfContact(long pid) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
