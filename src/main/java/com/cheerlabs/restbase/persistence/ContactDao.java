package com.cheerlabs.restbase.persistence;

import java.util.Collection;

import com.cheerlabs.restbase.core.Contact;
import com.cheerlabs.restbase.core.ContactAttrs;

public interface ContactDao {
	public Contact findContactByName(String contactName);
    public Contact findContactById(long id);
    public Contact findContactByEmail(String email);
    public Contact findContactByPhone(String phone);
    public Collection<Contact> findAllContacts();
    public void addUpdateContact(Contact contact);
    public void deleteContact(Contact contact);

}
