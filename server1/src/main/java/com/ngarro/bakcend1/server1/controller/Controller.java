package com.ngarro.bakcend1.server1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngarro.bakcend1.server1.model.Transaction;
import com.ngarro.bakcend1.server1.service.ServiceImpl;

@RestController
@RequestMapping("/backendserver1")
public class Controller {

    // private TransactionRepository transRepository;
	private ServiceImpl service;
	public Controller(ServiceImpl service){
		this.service = service;
	}
	
	
	@GetMapping("/success/{accountNumber}")	
	public List<Transaction> getServerTransaction(@PathVariable String accountNumber ){
		// System.out.println(accountNumber);
		// List<Transaction> trans = this.transRepository.findByAccountNumberAndStatus(accountNumber, "success");
		   List<Transaction> trans = this.service.getServerTransaction(accountNumber);
		return trans;
	}
    
}

