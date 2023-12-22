package com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leads;
import com.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveleadinfo(Leads lead)
	{
		leadRepo.save(lead);
	}
	
	@Override
	public List<Leads> getAllLeads()
	{
		List<Leads> leads=leadRepo.findAll();
		return leads;
	}
	@Override
	public void deleteonelead(long id)
	{
		leadRepo.deleteById(id);
	}

	@Override
	public Leads updatelead(long id) {
		Optional<Leads> findById = leadRepo.findById(id);
		Leads lead=findById.get();
		return lead;
	}

	@Override
	public void updateLeadData(Leads lead1) {
		leadRepo.save(lead1);
		
	}

	
	

	
	
	

	

}
