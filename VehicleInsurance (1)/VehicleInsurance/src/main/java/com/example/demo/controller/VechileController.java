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

import com.example.demo.entity.Vechicle;
import com.example.demo.service.VechicleService;



@RestController//itself annotated @controller and @Response Body
@CrossOrigin("*")
@RequestMapping("/vechicle")
public class VechileController {
	@Autowired
	private final VechicleService vechicleService;

	public VechileController(VechicleService vechicleService) {
		super();
		this.vechicleService = vechicleService;
	}
	@PostMapping
	public ResponseEntity<Vechicle>saveVechicle(@RequestBody Vechicle vechicle)
	{
return new ResponseEntity<Vechicle>(vechicleService.saveVechicle(vechicle)
		,HttpStatus.CREATED);
	}
	@GetMapping
	public List<Vechicle>getVechicle()
	{
		return vechicleService.getAllVechicle();
	}
	@GetMapping("{id}")
	public ResponseEntity<Vechicle>getVechicleById(@PathVariable("id")
	int vechicleId)
	{
return new ResponseEntity<Vechicle>(vechicleService.getVechicleById(vechicleId)
		,HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Vechicle>updateVechicle(@PathVariable("id")
	int id,@RequestBody Vechicle vechicle)
	{
		return new ResponseEntity<Vechicle>(vechicleService
				.updateVechicle(vechicle, id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteVechicle(@PathVariable("id")
	int id)
	{
		vechicleService.deleteVechicle(id);
return new ResponseEntity<String>("Vechicle Details deleted Successfully!!"
		,HttpStatus.OK);
	}
	

}
