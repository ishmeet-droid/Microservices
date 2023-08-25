package com.nagarro.backend2.server2.service;

import java.util.List;

import com.nagarro.backend2.server2.model.Transaction;

public interface ServiceInterface {

    List<Transaction> getServerTransaction(String accountNumber);
    
}
