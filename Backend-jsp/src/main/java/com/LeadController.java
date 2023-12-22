//package com.example.demo;





package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Leads;
import com.LeadService;


@Controller
public class LeadController {
	@Autowired
	private LeadService leadServ;

	@RequestMapping("/show")
	public String show()
	{
		return "show";
	}
	
	@RequestMapping("/savedata")
	public String saveleadinfo(Leads lead)
	{ 
		leadServ.saveleadinfo(lead);
		//LeadEmail.LeadEmailsend(lead.getEmail(),"Car Booking","Welcome to Toyota Cars..");
		return "show";
	}
	
	@RequestMapping("/listall")
	public String listalldata(Model model)
	{
		List<Leads> leads=leadServ.getAllLeads();
		model.addAttribute("leads", leads);
		return "listall"; 
	}
	
	@RequestMapping("/deletelead")
	public String deleteLeaddata(long id,Model model)
	{
		leadServ.deleteonelead(id); 
		List<Leads> leads=leadServ.getAllLeads();
		model.addAttribute("leads",leads);
		return "listall";
 	}
	
	@RequestMapping("/updatelead")
	public String updateLead(long id, Model model)
	{
		Leads lead=leadServ.updatelead(id);
		model.addAttribute("leads", lead);
		return "updatelead";
	}
	
	@RequestMapping("/updatesavedata")
	public String updatelead(Leads lead1,Model model)
	{
		leadServ.updateLeadData(lead1);
		List<Leads> leads=leadServ.getAllLeads();
		model.addAttribute("leads", leads);
		return "listall";
	}
	
}
