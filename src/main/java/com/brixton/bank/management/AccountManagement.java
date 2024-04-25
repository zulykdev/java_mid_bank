package com.brixton.bank.management;

import com.brixton.bank.model.Account;
import com.brixton.bank.model.Client;
import com.brixton.bank.model.SavingAccount;
import com.brixton.bank.parameters.Messages;
import com.brixton.bank.util.BusinessUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

@Service
@Slf4j
@Setter
@Getter
public class AccountManagement {

    private Map<String, Client> clients;
    private Optional<Client> selectedClient;

    private Scanner input;

    public AccountManagement() {
        input = new Scanner(System.in);
    }

    public void showAccountInformation(){
        System.out.println("\n--- Opcion Mostrar informacion de cuenta ---");
        try {
            if (!selectedClient.isPresent()) {
                System.out.println("Ingrese identificacion del cliente: ");
                String identifier = input.nextLine();
                setSelectedClient(
                        BusinessUtils.obtenerValorComoOptional(getClients(), identifier));
            }
            System.out.println("Cuentas del Cliente ");
            for(Map.Entry<String, SavingAccount> entry : getSelectedClient().get().getSavingAccounts().entrySet()) {
                System.out.println("Account: " + entry.getValue().getAccountNumber());
            }
            System.out.println("Ingrese Nro de cuenta: ");
            String accountNumber = input.nextLine();
            Optional<SavingAccount> savingAccount = BusinessUtils.obtenerValorComoOptional(
                    getSelectedClient().get().getSavingAccounts(), accountNumber);
            System.out.println("--- Informacion de cuenta ---");
            savingAccount.ifPresentOrElse(value -> System.out.println(savingAccount),
                    () -> System.out.println(Messages.FAIL_SEARCH_ACCOUNT));
            System.out.println("-----------------------------");
        } catch (Exception e) {
            System.out.println(Messages.FAIL_SEARCH_CLIENT);
        }
    }

    /*public void showAccountInformation(){
        /*
        System.out.println("\n--- Opcion Mostrar informacion de cuenta ---");
        System.out.println("Cuentas del Cliente " + getSelectedClient().getName() + " " + getSelectedClient().getLastName());
        try {
            for(Map.Entry<String, SavingAccount> entry : getSelectedClient().getSavingAccounts().entrySet()) {
                System.out.println("Account: " + entry.getValue().getAccountNumber());
            }
            System.out.println("Ingrese Nro de cuenta: ");
            String accountNumber = input.nextLine();
            Optional<SavingAccount> savingAccount = BusinessUtils.obtenerValorComoOptional(
                    getSelectedClient().getSavingAccounts(), accountNumber);
            System.out.println("--- Informacion de cuenta ---");
            savingAccount.ifPresentOrElse(value -> System.out.println(savingAccount),
                    () -> System.out.println(Messages.FAIL_SEARCH_ACCOUNT));
            System.out.println("-----------------------------");
        } catch (Exception e) {
            System.out.println(Messages.FAIL_SEARCH_CLIENT);
        }
    }*/


}
