package com.example.TightlyCoupled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TightlyCoupledApplication {

	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant();

		ApplicationContext applicationContext=SpringApplication.run(TightlyCoupledApplication.class, args);
		restaurant.getTea().prepareDrink();
	}

}
