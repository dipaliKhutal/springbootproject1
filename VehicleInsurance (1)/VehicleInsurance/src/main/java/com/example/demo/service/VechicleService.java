package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vechicle;

public interface VechicleService {
	Vechicle saveVechicle(Vechicle vechicle);
	List<Vechicle>getAllVechicle();
	Vechicle getVechicleById(long id);
	Vechicle updateVechicle(Vechicle vechicle,long id);
	void deleteVechicle(long id);

}
