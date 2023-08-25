package com.nagarro.backend3.server3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.backend3.server3.model.Transaction;
import com.nagarro.backend3.server3.repository.TransactionRepository;

@Service
public class ServiceImpl implements ServiceInterface{

    private TransactionRepository transRepository;
    ServiceImpl(TransactionRepository transactionRepository){

        this.transRepository = transactionRepository ;
    }

    @Override
    public List<Transaction> getServerTransaction(String accountNumber) {
        
        List<Transaction> trans = this.transRepository.findByAccountNumberAndStatus(accountNumber, "pending");
        
        return trans;

    }
    
}
