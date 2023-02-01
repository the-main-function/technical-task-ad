package com.algodomain.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.entity.Charges;
import com.algodomain.task.entity.Product;
import com.algodomain.task.repo.ChargesRepository;

@Service
public class ChargesService {
	
	@Autowired
	private ChargesRepository chargesRepo;
	
	public Charges saveCharges(Charges charges) {
		return chargesRepo.save(charges);
	}
	
	public Charges setCharges(Product product, double gst, double delivery) {
		Charges charges = new Charges();
		charges.setGst(gst);
		charges.setDelivery(delivery);
		
		return chargesRepo.save(charges);	
	}
}
