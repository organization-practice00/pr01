package org.example.ohgiraffers.pr01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pr01Application {

	public static void main(String[] args) {

		System.out.println("Today is Friday");
		System.out.println("Issue 1");
		SpringApplication.run(Pr01Application.class, args);
	}

}
