package com.brixton.bank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class CreditAccount extends Account{

    private int numeroPrestamo;
    private double monto;
    private double interes;
    private List<LocalDate> calendarioPago;
    private int duracion;

    public double PagoMensual(double monto, double interes, int duracion){
        return 0.0;
    }

    public void registroPago(){

    }
}
