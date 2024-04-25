package com.brixton.bank.menu;

import com.brixton.bank.management.AccountManagement;
import com.brixton.bank.management.BankManagement;
import com.brixton.bank.management.LoanManagement;
import com.brixton.bank.model.Client;
import com.brixton.bank.model.IdentifyDocument;
import com.brixton.bank.model.SavingAccount;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuOpcion {

    private Scanner scanner;
    private BankManagement bank;


    public MenuOpcion() {
        scanner = new Scanner(System.in);
        bank = new BankManagement();
        Client client = new Client("70243392", "Hans", "Villaizan", new IdentifyDocument("DNI", "70243392"), LocalDate.of(2000, 8, 27), "982581458", "zolymo@gmail.com", "123456");
        SavingAccount savingAccountDemo = new SavingAccount();
        savingAccountDemo.setAccountNumber("70243392-2024");
        savingAccountDemo.setBalance(1000d);
        client.getSavingAccounts().put(savingAccountDemo.getAccountNumber(), savingAccountDemo);
        Map<String, Client> clients = new HashMap<>();
        clients.put(client.getId(), client);
        bank.setClients(clients);
        bank.getAccountManagement().setClients(clients);

    }

    public void mostrarMenuPrincipal() {
        while (true) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Menu Cliente");
            System.out.println("2. Menu Empleado");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    elegirCliente();
                    break;
                case 2:
                    mostrarMenuEmpleado();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void elegirCliente(){
        System.out.println("\n--- Menu Cliente ---");
        System.out.print("Ingrese id: ");
        String idClient = scanner.nextLine();
        if(bank.findClient(idClient)) {
            mostrarMenuCliente();
        }
    }

    private void mostrarMenuCliente() {
        while (true) {
            System.out.println("\n--- Menu Cliente ---");
            System.out.println("1. Ver detalle de Cuenta");
            System.out.println("2. Consulta Saldos y Transacciones de Cuenta");
            System.out.println("3. Realizar Deposito");
            System.out.println("4. Solicitar Prestamo");
            System.out.println("4. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Lógica para consultar saldos y transacciones
                    System.out.println("Consulta Saldos y Transacciones...");
                    bank.getAccountManagement().showAccountInformation();
                    break;
                case 2:
                    // Lógica para realizar depósito
                    System.out.println("Realizar Depósito...");
                    break;
                case 3:
                    // Lógica para solicitar préstamo
                    System.out.println("Solicitar Préstamo...");
                    break;
                case 4:
                    // Volver al menú principal
                    return;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void mostrarMenuEmpleado() {
        while (true) {
            System.out.println("\n--- Menu Empleado ---");
            System.out.println("1. Aprobar/Rechazar Solicitud de Prestamo");
            System.out.println("2. Administrar Cuentas de Cliente");
            System.out.println("3. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Lógica para aprobar o rechazar solicitud de préstamo
                    System.out.println("Aprobar/Rechazar Solicitud de Préstamo...");
                    break;
                case 2:
                    // Lógica para administrar cuentas de cliente
                    System.out.println("Administrar Cuentas de Cliente...");
                    menuEmpleadoOpcionCuenta();
                    break;
                case 3:
                    // Volver al menú principal
                    return;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void menuEmpleadoOpcionCuenta() {
        bank.getAccountManagement().showAccountInformation();
        while (true) {
            System.out.println("3. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 3:
                    // Volver al menú principal
                    return;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }
    }

    private void menuClienteOpcion1() {
        bank.getAccountManagement().showAccountInformation();
        while (true) {
            System.out.println("3. Volver al Menu Principal");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 3:
                    // Volver al menú principal
                    return;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }
    }



}
