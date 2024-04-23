package com.brixton.bank.model;

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
    private LocalDate fechaNacimiento;
    private String telefono;
    private String email;
    private String password;

    public Client(){

    }
    public Client(String id, String name, String lastName, IdentifyDocument docIdentidad, LocalDate fechaNacimiento,
                  String telefono, String email){
        setId(id);
        setName(name);
        setLastName(lastName);
        setDocIdentidad(docIdentidad);
        setFechaNacimiento(fechaNacimiento);
        setTelefono(telefono);
        setEmail(email);

    }

}
