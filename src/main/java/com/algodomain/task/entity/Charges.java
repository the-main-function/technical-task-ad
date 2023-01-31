package com.algodomain.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="charges")
public class Charges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "charge_id")
	int chargeId;
	
	double gst;
	
	double delivery;
}
