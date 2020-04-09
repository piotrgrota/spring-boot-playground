package com.example.rest;

import com.example.consts.TransactionStatus;
import com.example.dto.TransactionRequest;
import com.example.dto.TransactionResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping(path = "/transactions")
public class TransactionRestController {

    @PostMapping(path = "/create" ,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("create transaction for specific user.")
    public TransactionResponse sendTransaction(@RequestBody  TransactionRequest transactionRequest) {
        int randomValue = ThreadLocalRandom.current().nextInt(1, 100);
         return randomValue % 2 == 0 ? new TransactionResponse(transactionRequest.getName(), LocalDateTime.now(), TransactionStatus.CONFIRMED)
                 : new TransactionResponse(transactionRequest.getName(), LocalDateTime.now(), TransactionStatus.REJECTED);

    }

}
