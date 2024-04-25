package com.brixton.bank.model;

import com.brixton.bank.parameters.Messages;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@Slf4j
public class Account {
    private String id;
    private String accountNumber;
    @ToString.Exclude
    private Client client;
    private Double balance;
    private LocalDateTime openingDate;
    private Double interestRate;
    private LocalDateTime endingDate;
    private List<Movement> movements;

    private void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            log.info(Messages.SUCESS_DEPOSIT);
        } else{
            log.info(Messages.FAIL_DEPOSIT);
        }
    }

    private void withdraw(double amout) {
        if (getBalance() >= amout) {
            setBalance(getBalance() - amout);
            log.info(Messages.SUCESS_WITHDRAW);
        } else {
            log.info(Messages.FAIL_WITHDRAW);
        }
    }

}
