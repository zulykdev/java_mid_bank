package com.brixton.bank.model;

import com.brixton.bank.type.ClientType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

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
    }
}
