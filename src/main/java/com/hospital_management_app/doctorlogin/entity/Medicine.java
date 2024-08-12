package com.hospital_management_app.doctorlogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicines")
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="drug_Name")
	private String drugName;
	@Column(name="stock")
	private String stock;
	
	public Medicine() {
		super();
	}

	public Medicine(long id, String drugName, String stock) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.stock = stock;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the drugName
	 */
	public String getDrugName() {
		return drugName;
	}

	/**
	 * @param drugName the drugName to set
	 */
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	/**
	 * @return the stock
	 */
	public String getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	
}
