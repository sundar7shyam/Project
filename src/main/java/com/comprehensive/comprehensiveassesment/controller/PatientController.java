package com.comprehensive.comprehensiveassesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.comprehensive.comprehensiveassesment.entity.PatientEntity;
import com.comprehensive.comprehensiveassesment.service.PatientService;

@CrossOrigin("*")
@RestController
@RequestMapping("/patient")
public class PatientController {

	
	@Autowired
	public PatientService patientService;
	
	/*
	@GetMapping("/getall")
	public List<PatientEntity> getAll(){
		return patientService.getAll();
	}
	
	
	
	@PostMapping("/addpatients")
	public List<PatientEntity> addPatients(@RequestBody List<PatientEntity> patients) {
		return patientService.savePatients(patients);
	}
	
	*/
	@GetMapping("/patients")
	public List<PatientEntity> findAllPatients(){
		return patientService.getPatients();
	}
	
	@PostMapping("/patients")
	public PatientEntity addPatient(@RequestBody PatientEntity patient) {
		return patientService.savePatient(patient);
	}
	
	//public ResponseEntity<PatientEntity> getPatientById(@PathVariable int id) {
		//PatientEntity patientEntity = patientService.findById(id)
			//	.orElseThrow(() -> new ResourceNotFoundException("Patient not exist with id :"+ id));
				//return ResponseEntity.ok(patient);
	//}
	
	
	@GetMapping("/patients/{id}")
	public PatientEntity findPatientById(@PathVariable int id) {
		return patientService.getPatientById(id);
	}
	
	@PutMapping("/patients/{id}")
	public PatientEntity updatePatient(@RequestBody PatientEntity patient) {
		return patientService.savePatient(patient);
	}
	
	@DeleteMapping("/patients/{id}")
	public String deletePatient(@PathVariable int id) {
		return patientService.deletePatient(id);
	}
	/*
	@GetMapping("/patientByName/{name}")
	public PatientEntity findPatientByName(String name) {
		return patientService.getPatientByName(name);
	}
	
	
	
	*/
	
}
