package com.hospital_management_app.doctorlogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_management_app.doctorlogin.entity.Medicine;
import com.hospital_management_app.doctorlogin.repository.MedicineRepository;

@RestController
@RequestMapping("/api/v1/medicine")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicineController {

	private MedicineRepository medicineRepository;

	public MedicineController(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}
	
	@PostMapping
	public Medicine createMedicin(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
	}
	
	@GetMapping
	public List<Medicine> getAllMedicin(){
		return medicineRepository.findAll();
	}
}
