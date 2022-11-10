package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface Leadservices {
public void saveonelead(Lead lead);

public Lead findbyid(long id);

public void deletebyid(long id);

public List<Lead> getallleads();






}
