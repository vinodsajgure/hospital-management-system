package com.hospital_management_app.doctorlogin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_management_app.doctorlogin.entity.Appointment;
import com.hospital_management_app.doctorlogin.repository.AppointmentRepository;

@RestController
@RequestMapping("api/v1/appointment")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {

	private AppointmentRepository appointmentRepository;

	public AppointmentController(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}
	
	@PostMapping
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	
	@GetMapping
	public List<Appointment> getAllAppointment(){
		return appointmentRepository.findAll();
	} 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteAppointment(@PathVariable long id) throws AttributeNotFoundException {
		Appointment appointment = appointmentRepository.findById(id).orElseThrow(()-> new AttributeNotFoundException("Appointment not found with id "+id));
		appointmentRepository.delete(appointment);
		Map<String,Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		
		return ResponseEntity.ok(response);
	}
}
