package com.brixton.bank.model;

import com.brixton.bank.type.LoanType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@ToString
@Slf4j
public class Loan {

    private String id;
    private String loanNumber;
    private LoanType loanType;
    private Client client;
    private Double balance;
    private LocalDateTime openingDate;
    private Double loanRate;
    private Integer quoteNumber;
    private Movement lastMovement;
    private LocalDateTime endingDate;
    private List<Movement> movements;

    public Loan(String id, String loanNumber, LoanType loanType, Double balance, Double loanRate, Integer quotes) {
        setId(id);
        setLoanNumber(loanNumber);
        setLoanType(loanType);
        setBalance(balance);
        setOpeningDate(LocalDateTime.now());
        setLoanRate(loanRate);
        setQuoteNumber(quotes);
    }
}
