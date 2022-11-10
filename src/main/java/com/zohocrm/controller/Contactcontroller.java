package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.contact;
import com.zohocrm.services.Contactservice;
@Controller
public class Contactcontroller {
	@Autowired
	private Contactservice contactservice;
	@RequestMapping("/contactleads")
	public String contactleads(Model model) {
	List<contact> contact = contactservice.contactleads();
	model.addAttribute("contacts", contact);
	return "contact_leads";
	}
		
	}
	
