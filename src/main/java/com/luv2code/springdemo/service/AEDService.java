package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.AED;

public interface AEDService {

	public List<AED> getAED();

	public void saveAED(AED theAED);

	public AED getAED(int theId);

	public void deleteAED(int theId);
	
}
