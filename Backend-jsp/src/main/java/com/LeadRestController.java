package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Leads;
import com.LeadRepository;

@RestController
public class LeadRestController {

	@Autowired
	private LeadRepository leadRepo;
	
	@GetMapping("/listallapi")
	public List<Leads> getallleadsAPI()
	{
		List<Leads> leads = leadRepo.findAll();
		return leads;
	}
	
	@PostMapping("/saveleadapi")
		public void saveapi(@RequestBody Leads lead)
		{
			leadRepo.save(lead);
		}
	
	@PutMapping("/updateleadapi")
	public void updateapi(@RequestBody Leads lead)
	{
		leadRepo.save(lead);
	}
	
	@DeleteMapping("/deleteapi/{id}")
	public void deleteapi(@PathVariable long id)
	{
		leadRepo.deleteById(id);
	}
}
