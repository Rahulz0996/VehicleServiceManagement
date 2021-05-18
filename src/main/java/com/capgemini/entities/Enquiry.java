package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




import lombok.Data;

@Entity
@Data
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Enquiry_id;
	private String Enquiry_desc;
	private String Admin_Respose;
	private boolean is_deleted;
	private String create_datetime;
	private String update_datetime;
	
}
