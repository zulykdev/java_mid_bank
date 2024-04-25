package com.brixton.bank.model;

import com.brixton.bank.type.TransactionType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@Slf4j
public class Movement {

    UUID uuid;
    LocalDateTime processDate;
    TransactionType transactionType;
    Double transactionAmount;
    Double transactionFactor;

    public Movement(LocalDateTime processDate, TransactionType transactionType, Double transactionAmount) {
        setProcessDate(processDate);
        setTransactionType(transactionType);
        setTransactionAmount(transactionAmount);
        setUuid(UUID.randomUUID());
        switch (getTransactionType()) {
            case TRANSFER, WITHDRAW -> setTransactionFactor(-1D);
            default -> setTransactionFactor(1D);
        }
    }

    public Double getTransactionAmount() {
        return transactionAmount * getTransactionFactor();
    }
}
