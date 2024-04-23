package com.brixton.bank.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Account {
    private String id;
    private String numero;
    private Client cliente;
    private Double saldo;
    private LocalDateTime fechaApertura;
    private LocalDateTime fechaCancelacion;

    private void deposit() {

    }

    private void withdraw() {

    }

}
