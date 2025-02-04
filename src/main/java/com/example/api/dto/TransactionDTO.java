package com.example.api.dto;

import java.time.LocalDateTime;

public class TransactionDTO {
    private Long id;
    private String productID;
    private String productName;
    private Double amount;
    private String customerName;
    private int status;
    private LocalDateTime transactionDate;
    private String createBy;
    private LocalDateTime createOn;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductID() { return productID; }
    public void setProductID(String productID) { this.productID = productID; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public LocalDateTime getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDateTime transactionDate) { this.transactionDate = transactionDate; }

    public String getCreateBy() { return createBy; }
    public void setCreateBy(String createBy) { this.createBy = createBy; }

    public LocalDateTime getCreateOn() { return createOn; }
    public void setCreateOn(LocalDateTime createOn) { this.createOn = createOn; }
}
