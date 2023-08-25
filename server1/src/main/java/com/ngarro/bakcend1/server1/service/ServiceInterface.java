package com.ngarro.bakcend1.server1.service;

import java.util.List;

import com.ngarro.bakcend1.server1.model.Transaction;

public interface ServiceInterface {

    List<Transaction> getServerTransaction(String accountNumber);
    
}
