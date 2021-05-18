package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Enquiry;
import com.capgemini.service.EnquiryServiceImpl;

@RestController
@RequestMapping("/api/enquiry/")
public class EnquiryController {

	@Autowired
	private EnquiryServiceImpl enquiryServiceImpl;
	
	@PostMapping("/")
	public ResponseEntity<Boolean> createEnquiry(@RequestBody Enquiry enquiry) {
		
		enquiryServiceImpl.createEnquiry(enquiry);
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
	