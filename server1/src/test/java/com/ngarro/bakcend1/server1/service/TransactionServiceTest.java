package com.ngarro.bakcend1.server1.service;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ngarro.bakcend1.server1.model.Transaction;
import com.ngarro.bakcend1.server1.repository.TransactionRepository;

@SpringBootTest
public class TransactionServiceTest {

    @MockBean
    private TransactionRepository transRepo;

    @Autowired
    private ServiceImpl serviceTest;

    Transaction trans1;
    Transaction trans2;

    @BeforeEach
    public void init(){

        trans1 = Transaction.builder()
        .accountNumber("123456")
        .amount(6000)
        .status("success")
        .build();

         trans2 = Transaction.builder()
        .accountNumber("123456")
        .amount(99000)
        .status("success")
        .build();
    }
    
    @Test
    public void getTrnsaction(){
        
       

        List<Transaction> trans = Arrays.asList(trans1,trans2);

        Mockito.when(transRepo.findByAccountNumberAndStatus("123456","success")).thenReturn(trans);

        List<Transaction> trnsactions = serviceTest.getServerTransaction("123456");

        Assertions.assertEquals(2, trnsactions.size());

    }

    
}
