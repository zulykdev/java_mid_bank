package com.brixton.bank.management;

import java.util.Scanner;

public class BankManagement {


    void menu(){
        Scanner in = new Scanner(System.in);
        String option ="";
        while (!option.equals("99")) {
            System.out.println("=== ACCESO === ");
            System.out.println("1 Login Empleado");
            System.out.println("2 Login Cliente");
            System.out.println("99 Salir");
        }
    }

}
