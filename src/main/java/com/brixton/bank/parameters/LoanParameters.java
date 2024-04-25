package com.brixton.bank.parameters;

import java.util.HashMap;
import java.util.Map;


public class LoanParameters {

    public static Map<String, GlobalParameter> loanRates;

    static {

        GlobalParameter interestRateVip = new GlobalParameter(Parameters.INTEREST_RATE_VIP, 0.12);
        GlobalParameter interestRateSignature = new GlobalParameter(Parameters.INTEREST_RATE_SIGNATURE, 0.09);
        GlobalParameter interestRateGold = new GlobalParameter(Parameters.INTEREST_RATE_GOLD, 0.07);
        GlobalParameter interestRateDefault = new GlobalParameter(Parameters.INTEREST_RATE_DEFAULT, 0.001);
        GlobalParameter loanRateVip = new GlobalParameter(Parameters.LOAN_RATE_VIP, 0.16);
        GlobalParameter loanRateSignature = new GlobalParameter(Parameters.LOAN_RATE_SIGNATURE, 0.13);
        GlobalParameter loanRateGold = new GlobalParameter(Parameters.LOAN_RATE_GOLD, 0.1);
        GlobalParameter loanRateDefault = new GlobalParameter(Parameters.LOAN_RATE_DEFAULT, 0.8);
        loanRates = new HashMap<>();
        loanRates.put(interestRateVip.getKey(), interestRateVip);
        loanRates.put(interestRateSignature.getKey(), interestRateSignature);
        loanRates.put(interestRateGold.getKey(), interestRateGold);
        loanRates.put(interestRateDefault.getKey(), interestRateDefault);
        loanRates.put(loanRateVip.getKey(), loanRateVip);
        loanRates.put(loanRateSignature.getKey(), loanRateSignature);
        loanRates.put(loanRateGold.getKey(), loanRateGold);
        loanRates.put(loanRateDefault.getKey(), loanRateDefault);
    }

    private LoanParameters(){

    }

}
