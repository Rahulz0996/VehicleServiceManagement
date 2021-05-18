package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Enquiry;
import com.capgemini.repository.EnquiryRepository;


@Service
public class EnquiryServiceImpl implements IEnquiryService {
	
	@Autowired
	private EnquiryRepository enquiryRepository;

	@Override
	public boolean createEnquiry(Enquiry enquiry)  {
		
		// Service is right plaice for Validations before db related activitites
		enquiryRepository.save(enquiry);
		
		return false;
	}
}