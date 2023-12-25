package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Insurance;
import com.example.demo.service.InsuranceService;

@RestController//itself annotated @controller and @Response Body
@CrossOrigin("*")
@RequestMapping("/insurance")
public class InsuranceController {
	@Autowired
	private final InsuranceService insuranceService;

	public InsuranceController(InsuranceService insuranceService) {
		super();
		this.insuranceService = insuranceService;
	}
	@PostMapping
	public ResponseEntity<Insurance>saveInsurance(@RequestBody Insurance insurance)
	{
return new ResponseEntity<Insurance>(insuranceService.saveInsurance(insurance)
		,HttpStatus.CREATED);
	}
	@GetMapping
	public List<Insurance>getInsurance()
	{
		return insuranceService.getAllInsurance();
	}
	@GetMapping("{id}")
	public ResponseEntity<Insurance>getInsuranceById(@PathVariable("id")
	int insuranceId)
	{
return new ResponseEntity<Insurance>(insuranceService.getInsuranceById(insuranceId)
		,HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Insurance>updateInsurance(@PathVariable("id")
	int id,@RequestBody Insurance insurance)
	{
		return new ResponseEntity<Insurance>(insuranceService
				.updateInsurance(insurance, id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteInsurance(@PathVariable("id")
	int id)
	{
		insuranceService.deleteInsurance(id);
return new ResponseEntity<String>("Insurance Details deleted Successfully!!"
		,HttpStatus.OK);
	}

}
