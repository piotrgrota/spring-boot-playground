package com.example.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class TransactionRequest {

    @Getter
    private String name;

    @Getter
    private double amount;

    public TransactionRequest(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public TransactionRequest() {
    }
}
