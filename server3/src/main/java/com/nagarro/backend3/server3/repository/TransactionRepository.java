package com.nagarro.backend3.server3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.backend3.server3.model.Transaction;



@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

List<Transaction> findByAccountNumberAndStatus(String accountNumber,String status);

}