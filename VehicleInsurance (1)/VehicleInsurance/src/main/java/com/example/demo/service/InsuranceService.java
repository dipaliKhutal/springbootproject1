package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Insurance;



public interface InsuranceService {
	Insurance saveInsurance(Insurance insurance);
	List<Insurance>getAllInsurance();
	Insurance getInsuranceById(long id);
	Insurance updateInsurance(Insurance insurance,long id);
	void deleteInsurance(long id);

}
