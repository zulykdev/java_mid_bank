package com.brixton.bank.model;

import com.brixton.bank.type.ClientType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Client {
    private String id;
    private String name;
    private String lastName;
    private IdentifyDocument docIdentidad;
    private LocalDate birthday;
    private String phoneNumber;
    private String email;
    private String password;
    private ClientType clientType;
    private Map<String, SavingAccount> savingAccounts;
    private Map<String, Loan> loans;

    public Client(){

    }
    public Client(String id, String name, String lastName, IdentifyDocument docIdentidad, LocalDate birthday, String phoneNumber, String email, String password){
        setId(id);
        setName(name);
        setLastName(lastName);
        setDocIdentidad(docIdentidad);
        setBirthday(birthday);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPassword(password);
        setSavingAccounts(new HashMap<>());
        setLoans(new HashMap<>());
    }
}
