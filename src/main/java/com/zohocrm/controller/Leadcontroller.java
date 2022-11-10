package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Lead;
import com.zohocrm.entities.contact;
import com.zohocrm.services.Contactservice;
import com.zohocrm.services.Leadservices;

@Controller
public class Leadcontroller {
	@Autowired
	private Leadservices leadservice;
	@Autowired
	private Contactservice contactservice;

	@GetMapping("/viewnewleadpage")
	public String Createnewlead() {
		return "Create_new_lead";
	}

	@PostMapping("/save")
	public String savelead(@ModelAttribute("lead") Lead lead, Model model) {
		leadservice.saveonelead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";

	}
	@PostMapping("/convertlead")
	public String convertlead(@RequestParam("id")long id,Model model) {
		Lead lead = leadservice.findbyid(id);
		contact contact=new contact();
		contact.setFirstname(lead.getFirstname());
		contact.setLastname(lead.getLastname());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		contactservice.savelead(contact);
		leadservice.deletebyid(id);
		List<contact> contacts = contactservice.contactleads();
		model.addAttribute("contacts", contacts);
		return "contact_leads";
	}
	@RequestMapping("/listall")
	public String listallleads(Model model) {
		List<Lead> leads = leadservice.getallleads();
		model.addAttribute("leads", leads);
		return "list_all";
	}
	@RequestMapping("/leadinfo")
	public String leadinfo(@RequestParam("id")long id,Model model) {
		Lead lead = leadservice.findbyid(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
}