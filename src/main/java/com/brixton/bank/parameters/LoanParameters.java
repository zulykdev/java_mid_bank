package com.brixton.bank.parameters;

import java.util.HashMap;
import java.util.Map;


public class LoanParameters {

    public static Map<String, GlobalParameter> loanParameter;

    static {
        loanParameter = new HashMap<>();

        GlobalParameter interestRateVip = new GlobalParameter(Parameters.INTEREST_RATE_VIP, 0.12);
        GlobalParameter interestRateSignature = new GlobalParameter(Parameters.INTEREST_RATE_SIGNATURE, 0.09);
        GlobalParameter interestRateGold = new GlobalParameter(Parameters.INTEREST_RATE_GOLD, 0.07);

        loanParameter.put(interestRateVip.getKey(), interestRateVip);
        loanParameter.put(interestRateSignature.getKey(), interestRateSignature);
        loanParameter.put(interestRateGold.getKey(), interestRateGold);
    }
    /*
    private LoanParameters(){

    }*/

    public LoanParameters() {

    }



}
