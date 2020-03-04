package com.example.LooselyCoupled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LooselyCoupledApplication {
	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(LooselyCoupledApplication.class, args);
		Restaurant restaurant=applicationContext.getBean(Restaurant.class);
		restaurant.getHotDrink().prepareDrink();

	}
}
