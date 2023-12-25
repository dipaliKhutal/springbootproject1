package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Insurance;
import com.example.demo.exception.ResourceNotFound;
import com.example.demo.repository.InsuranceRepo;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	@Autowired
	private InsuranceRepo insuranceRepo;

	public InsuranceServiceImpl(InsuranceRepo insuranceRepo) {
		super();
		this.insuranceRepo = insuranceRepo;
	}

	@Override
	public Insurance saveInsurance(Insurance insurance) {
		return insuranceRepo.save(insurance);
	}

	@Override
	public List<Insurance> getAllInsurance() {
		return insuranceRepo.findAll();
	}

	@Override
	public Insurance getInsuranceById(long id) {
		return insuranceRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("Insurance","Id","id"));
	}

	@Override
	public Insurance updateInsurance(Insurance insurance, long id) {
		Insurance existingInsurance=insuranceRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("Insurance","Id","id"));
		existingInsurance.setInsuranceProvider(insurance.getInsuranceProvider());
		existingInsurance.setInsuranceNumber(insurance.getInsuranceNumber());
		existingInsurance.setInsuranceValidity(insurance.getInsuranceValidity());

		insuranceRepo.save(existingInsurance);
		
		return existingInsurance;
	}

	@Override
	public void deleteInsurance(long id) {
		// TODO Auto-generated method stub
		insuranceRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("Insurance","Id","id"));
		insuranceRepo.deleteById(id);
		
	}
	

}
