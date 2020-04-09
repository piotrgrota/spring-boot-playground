package com.example.dto;

import com.example.consts.TransactionStatus;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
public class TransactionResponse {

    @Getter
    private String name;

    @Getter
    private LocalDateTime localDateTime;

    @Getter
    private TransactionStatus status;

    public TransactionResponse(String name, LocalDateTime localDateTime, TransactionStatus status) {
        this.name = name;
        this.localDateTime = localDateTime;
        this.status = status;
    }

    public TransactionResponse() {
    }
}
