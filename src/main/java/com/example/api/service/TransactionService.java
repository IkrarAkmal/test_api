package com.example.api.service;

import com.example.api.repository.TransactionRepository;
import com.example.api.dto.TransactionDTO;
import com.example.api.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<TransactionDTO> getAllTransactions() {
        return transactionRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private TransactionDTO convertToDTO(Transaction transaction) {
        TransactionDTO dto = new TransactionDTO();
        dto.setId(transaction.getId());
        dto.setProductID(transaction.getProductID());
        dto.setProductName(transaction.getProductName());
        dto.setAmount(transaction.getAmount());
        dto.setCustomerName(transaction.getCustomerName());
        dto.setStatus(transaction.getStatus());
        dto.setTransactionDate(transaction.getTransactionDate());
        dto.setCreateBy(transaction.getCreateBy());
        dto.setCreateOn(transaction.getCreateOn());
        return dto;
    }
}
