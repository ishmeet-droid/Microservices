package com.ngarro.bakcend1.server1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ngarro.bakcend1.server1.model.Transaction;
import com.ngarro.bakcend1.server1.repository.TransactionRepository;

@Service
public class ServiceImpl implements ServiceInterface{

    private TransactionRepository transRepository;
    ServiceImpl(TransactionRepository transactionRepository){

        this.transRepository = transactionRepository ;
    }

    @Override
    public List<Transaction> getServerTransaction(String accountNumber) {
        
        List<Transaction> trans = this.transRepository.findByAccountNumberAndStatus(accountNumber, "success");
        
        return trans;

    }
    
}
