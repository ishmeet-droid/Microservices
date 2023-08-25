package com.nagarro.backend3.server3.service;

import java.util.List;

import com.nagarro.backend3.server3.model.Transaction;

public interface ServiceInterface {

    List<Transaction> getServerTransaction(String accountNumber);
    
}
