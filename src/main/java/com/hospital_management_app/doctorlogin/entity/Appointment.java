package com.hospital_management_app.doctorlogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="appointments")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="symptoms")
	private String symptoms;
	@Column(name="age")
	private String age;
	@Column(name="number")
	private String number;
	
	public Appointment() {
		super();
	}

	public Appointment(Long id, String name, String symptoms, String age, String number) {
		super();
		this.id = id;
		this.name = name;
		this.symptoms = symptoms;
		this.age = age;
		this.number = number;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the symptoms
	 */
	public String getSymptoms() {
		return symptoms;
	}

	/**
	 * @param symptoms the symptoms to set
	 */
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	
	
	
}
