package com.nagarro.backend2.server2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.backend2.server2.model.Transaction;
import com.nagarro.backend2.server2.repository.TransactionRepository;

@Service
public class ServiceImpl implements ServiceInterface{

    private TransactionRepository transRepository;
    ServiceImpl(TransactionRepository transactionRepository){

        this.transRepository = transactionRepository ;
    }

    @Override
    public List<Transaction> getServerTransaction(String accountNumber) {
        
        List<Transaction> trans = this.transRepository.findByAccountNumberAndStatus(accountNumber, "fail");
        
        return trans;

    }
    
}
