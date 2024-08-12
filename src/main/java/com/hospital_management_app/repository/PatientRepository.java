package com.hospital_management_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital_management_app.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
