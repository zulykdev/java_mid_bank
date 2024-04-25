package com.brixton.bank.model;

import com.brixton.bank.parameters.GlobalParameter;
import com.brixton.bank.parameters.LoanParameters;
import com.brixton.bank.parameters.Parameters;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString(callSuper = true)
public class SavingAccount extends Account{

    public double calculateInterest(){
        return proyectInterest(1);
    }

    public double proyectInterest(int year){
        double annualInterestRate = 0;
        switch (getClient().getClientType()) {
            case VIP -> annualInterestRate = (Double) LoanParameters.loanRates.get(Parameters.INTEREST_RATE_VIP).getValue();
            case GOLD -> annualInterestRate = (Double) LoanParameters.loanRates.get(Parameters.INTEREST_RATE_GOLD).getValue();
            case SIGNATURE -> annualInterestRate = (Double) LoanParameters.loanRates.get(Parameters.INTEREST_RATE_SIGNATURE).getValue();
            default -> annualInterestRate = (Double) LoanParameters.loanRates.get(Parameters.INTEREST_RATE_DEFAULT).getValue();
        }
        return getBalance() * annualInterestRate * year;
    }

}
