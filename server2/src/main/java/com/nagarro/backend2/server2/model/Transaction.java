package com.nagarro.backend2.server2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transactionDetails")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int amount;
	private String status;
	@JsonIgnore
	private String accountNumber;
	

	public Transaction(int amount,String status, String accountNumber) {
		this.amount = amount;
		this.status = status;
		this.accountNumber = accountNumber;
	}

	// public Long getId() {
	// 	return id;
	// }
	
	// public int getAmount() {
	// 	return amount;
	// }
	// public void setAmount(int amount) {
	// 	this.amount = amount;
	// }
	// public String getStatus() {
	// 	return status;
	// }
	// public void setStatus(String status) {
	// 	this.status = status;
	// }
	// public String getAccountNumber() {
	// 	return accountNumber;
	// }
	// public void setAccountNumber(String accountNumber) {
	// 	this.accountNumber = accountNumber;
	// }
	
	
}
