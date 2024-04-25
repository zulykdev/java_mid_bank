package com.brixton.bank.management;

import com.brixton.bank.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Setter
@Getter
public class LoanManagement {

    Map<String, Client> clients;

    public void prepareLoan(Client client) {

    }

}
