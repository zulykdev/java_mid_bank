package com.brixton.bank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SavingAccount extends Account{
    private  double interes;

    public double calculoInteres (double interes, double monto){
        return 0.0;
    }
}
