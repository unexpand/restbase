package com.cheerlabs.restbase.services;

import com.cheerlabs.restbase.core.Contact;
import com.cheerlabs.restbase.core.Contacts;

public interface ContactService {
	
	public Contact getContactById(Long id);

	public Contacts getAllContacts();

//	public Contacts getContactsOfContact(Long id);

}
