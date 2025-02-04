package com.example.api.controller;

import com.example.api.service.TransactionService;
import com.example.api.dto.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> getTransactions() {
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }
}
