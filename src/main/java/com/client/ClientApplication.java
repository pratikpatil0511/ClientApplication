package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.addition.calculator.Sum;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		
		Sum sum=new Sum();
		
		int result = sum.sum(3, 2);
		System.out.println("Addition : "+result+" (ClientApplication)");
	}

}
