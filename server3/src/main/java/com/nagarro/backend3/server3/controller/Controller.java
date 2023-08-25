package com.nagarro.backend3.server3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.backend3.server3.model.Transaction;

import com.nagarro.backend3.server3.service.ServiceImpl;


@RestController
@RequestMapping("/backendserver3")
public class Controller {

    private ServiceImpl service;
	public Controller(ServiceImpl service){
		this.service = service;
	}
	
	@GetMapping("/pending/{accountNumber}")	
	public List<Transaction> getServerTransaction(@PathVariable String accountNumber ){
		// System.out.println(accountNumber);
		List<Transaction> trans = this.service.getServerTransaction(accountNumber);
		
		return trans;
	}
    
}