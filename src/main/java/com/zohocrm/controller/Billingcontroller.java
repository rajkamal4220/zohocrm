package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.contact;
import com.zohocrm.services.Contactservice;

@Controller
public class Billingcontroller {
	@Autowired
	private Contactservice contactservice;

	@RequestMapping("/generatebill")
	public String generatebillbyid(@RequestParam("id") long id, Model model) {
		contact contact = contactservice.getcontactbyid(id);
		model.addAttribute("contact", contact);
		return "generate_bill";

	}
	
	
	
}