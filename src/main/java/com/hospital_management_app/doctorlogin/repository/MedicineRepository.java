package com.hospital_management_app.doctorlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital_management_app.doctorlogin.entity.Medicine;

@Repository
public interface MedicineRepository extends  JpaRepository<Medicine, Long>{

}
