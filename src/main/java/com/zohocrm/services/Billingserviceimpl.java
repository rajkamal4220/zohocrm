package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repository.Billingrepository;

@Service
public class Billingserviceimpl implements Billingservice {

	@Autowired
	private Billingrepository billingrepo;

	@Override
	public void savedata(Billing billing) {
		billingrepo.save(billing);

	}

	
}
