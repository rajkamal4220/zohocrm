package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.contact;
import com.zohocrm.repository.Contactrepository;

@Service
public class Contactserviceimpl implements Contactservice {
	@Autowired
	private Contactrepository contactrepo;

	@Override
	public void savelead(contact contact) {
		contactrepo.save(contact);
	}

	@Override
	public List<contact> contactleads() {
List<contact> contact = contactrepo.findAll();
		return contact;
	}

	@Override
	public contact getcontactbyid(long id) {

		Optional<contact> findById = contactrepo.findById(id);
		contact contact = findById.get();
		return contact;
	}

}
