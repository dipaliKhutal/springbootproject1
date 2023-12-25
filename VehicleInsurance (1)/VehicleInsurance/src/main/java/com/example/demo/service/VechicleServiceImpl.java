package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Insurance;
import com.example.demo.entity.Vechicle;
import com.example.demo.exception.ResourceNotFound;
import com.example.demo.repository.VechicleRepo;



@Service
public class VechicleServiceImpl implements VechicleService{
	@Autowired
	private VechicleRepo vechicleRepo;

	public VechicleServiceImpl(VechicleRepo vechicleRepo) {
		super();
		this.vechicleRepo = vechicleRepo;
	}

	@Override
	public Vechicle saveVechicle(Vechicle vechicle) {
		return vechicleRepo.save(vechicle);
	}

	@Override
	public List<Vechicle> getAllVechicle() {
		return vechicleRepo.findAll();
	}

	@Override
	public Vechicle getVechicleById(long id) {
		return vechicleRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("Vechicle","Id","id"));
	}

	@Override
	public Vechicle updateVechicle(Vechicle vechicle, long id) {
		Vechicle existingVechicle=vechicleRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("Vechicle","Id","id"));
		existingVechicle.setCategory(vechicle.getCategory());
		existingVechicle.setPlateNumber(vechicle.getPlateNumber());
		existingVechicle.setManufacturer(vechicle.getPlateNumber());
		existingVechicle.setType(vechicle.getType());
		existingVechicle.setRegistrationDate(vechicle.getRegistrationDate());
		existingVechicle.setPremiumAmount(vechicle.getPremiumAmount());
		existingVechicle.setNextPreDate(vechicle.getNextPreDate());
		existingVechicle.setPreviousPreDate(vechicle.getPreviousPreDate());
		existingVechicle.setPendingFines(vechicle.getPendingFines());
		

		vechicleRepo.save(existingVechicle);
		
		return existingVechicle;
	}

	@Override
	public void deleteVechicle(long id) {
		vechicleRepo.findById(id).orElseThrow(()
				->new ResourceNotFound("Vechicle","Id","id"));
		vechicleRepo.deleteById(id);
		
	}
	

}
