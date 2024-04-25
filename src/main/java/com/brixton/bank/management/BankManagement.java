package com.brixton.bank.management;

import com.brixton.bank.menu.MenuOpcion;
import com.brixton.bank.model.Client;
import com.brixton.bank.model.Employee;
import com.brixton.bank.parameters.Messages;
import com.brixton.bank.type.MenuType;
import com.brixton.bank.util.BusinessUtils;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

@Slf4j
@Getter
@Setter
@Service
public class BankManagement {

    Map<String, Client> clients;

    Map<String, Employee> employees;

    AccountManagement accountManagement;

    LoanManagement loanManagement;
    public BankManagement() {
        clients = new HashMap<>();
        employees = new HashMap<>();
        accountManagement = new AccountManagement();
        loanManagement = new LoanManagement();
    }

    public boolean findClient(String id){
        Optional<Client> foundClient = BusinessUtils.obtenerValorComoOptional(getClients(), id);
        foundClient.ifPresentOrElse(p -> accountManagement.setSelectedClient(foundClient),
                () -> System.out.println(Messages.FAIL_SEARCH_CLIENT));
        return foundClient.isPresent();
    }

}
