package com;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Leads;

public interface LeadRepository extends JpaRepository<Leads, Long> {
	

}
