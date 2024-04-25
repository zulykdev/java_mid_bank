package com.brixton.bank;

import com.brixton.bank.menu.MenuOpcion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);

		MenuOpcion menu = new MenuOpcion();
		menu.mostrarMenuPrincipal();
	}

}
