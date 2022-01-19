package com.comprehensive.comprehensiveassesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comprehensive.comprehensiveassesment.entity.DoctorEntity;
import com.comprehensive.comprehensiveassesment.service.DoctorService;

@CrossOrigin("*")
@RestController
@RequestMapping("/doctor")
public class DoctorController {

	
	@Autowired
	public DoctorService doctorService;
	
	/*
	@GetMapping("/getAll")
	public List<DoctorEntity> getAll(){
		return doctorService.getAll();
	}

	
	
	
	@PostMapping("/adddoctors")
	public List<DoctorEntity> addDoctors(@RequestBody List<DoctorEntity> doctors) {
		return doctorService.saveDoctors(doctors);
	}
	*/
	
	@GetMapping("/doctors")
	public List<DoctorEntity> findAllDoctors(){
		return doctorService.getDoctors();
	}
	
	@PostMapping("/doctors")
	public DoctorEntity addDoctor(@RequestBody DoctorEntity doctor) {
		return doctorService.saveDoctor(doctor);
	}
	
	
	@GetMapping("/doctors/{id}")
	public DoctorEntity findDoctorById(int id) {
		return doctorService.getDoctorById(id);
	}
	
	/*
	@GetMapping("/doctorByName/{name}")
	public DoctorEntity findDoctorByName(String name) {
		return doctorService.getDoctorByName(name);
	}
	
	
	@PutMapping("/update")
	public DoctorEntity updateDoctor(@RequestBody DoctorEntity doctor) {
		return doctorService.saveDoctor(doctor);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable int id) {
		return doctorService.deleteDoctor(id);
	}*/
}
