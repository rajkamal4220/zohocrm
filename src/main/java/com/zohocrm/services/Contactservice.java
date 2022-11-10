package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.contact;

public interface Contactservice {
	public void savelead(contact contact);

	public List<contact> contactleads();

	public contact getcontactbyid(long id);

}
