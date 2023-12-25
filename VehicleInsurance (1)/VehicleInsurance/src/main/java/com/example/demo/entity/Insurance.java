package com.example.demo.entity;

import javax.persistence.*;
@Entity
@Table(name="insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "insurance_id")
	private long id;

	@Column(name = "insurance_provider")
	private String insuranceProvider;

	@Column(name = "insurance_number")
	private String insuranceNumber;

	@Column(name = "insurance_validity")
	private String insuranceValidity;

	public Insurance() {
		super();
	}

	public Insurance(long id, String insuranceProvider, String insuranceNumber, String insuranceValidity) {
		super();
		this.id = id;
		this.insuranceProvider = insuranceProvider;
		this.insuranceNumber = insuranceNumber;
		this.insuranceValidity = insuranceValidity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public String getInsuranceNumber() {
		return insuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}

	public String getInsuranceValidity() {
		return insuranceValidity;
	}

	public void setInsuranceValidity(String insuranceValidity) {
		this.insuranceValidity = insuranceValidity;
	}

	@Override
	public String toString() {
		return "Insurance [id=" + id + ", insuranceProvider=" + insuranceProvider + ", insuranceNumber="
				+ insuranceNumber + ", insuranceValidity=" + insuranceValidity + "]";
	}
	
	

}
