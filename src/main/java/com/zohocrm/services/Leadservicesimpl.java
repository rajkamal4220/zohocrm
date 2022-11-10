package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repository.Leadrepository;

@Service
public class Leadservicesimpl implements Leadservices {
	@Autowired
	private Leadrepository leadrepo;

	@Override
	public void saveonelead(Lead lead) {
		leadrepo.save(lead);
	}

	@Override
	public Lead findbyid(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deletebyid(long id) {
		leadrepo.deleteById(id);
	}

	@Override
	public List<Lead> getallleads() {
List<Lead> leads = leadrepo.findAll();
		return leads ;
	}
	

}
