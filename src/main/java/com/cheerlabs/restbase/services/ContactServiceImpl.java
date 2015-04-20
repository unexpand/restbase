package com.cheerlabs.restbase.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cheerlabs.restbase.core.Contact;
import com.cheerlabs.restbase.core.Contacts;
import com.cheerlabs.restbase.persistence.ContactDao;

@Service
@Path("/contactservice")
@Transactional
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	public ContactServiceImpl() {
		System.out.println("In Constructor ContactServiceImpl");
		
	}

	@GET
	@Path("/contacts/{id}")
	@Produces("application/xml")
	public Contact getContactById(@PathParam("id") Long id) {
		System.out.println("I am here in getname");
		Contact contact = contactDao.findContactById(id);
		return contact;
	}

	@GET
	@Path("/contacts")
	@Produces("application/xml")
	public Contacts getAllContacts() {
		System.out.println("I am here in get contactss");
		Contacts contacts = new Contacts();
		contacts.setContacts(contactDao.findAllContacts());
		return contacts;
	}

	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

}
