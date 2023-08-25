package com.nagarro.backend2.server2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.backend2.server2.model.Transaction;



@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

List<Transaction> findByAccountNumberAndStatus(String accountNumber,String status);

}