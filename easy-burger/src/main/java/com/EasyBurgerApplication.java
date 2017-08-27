package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EasyBurgerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EasyBurgerApplication.class, args);
	}
}
