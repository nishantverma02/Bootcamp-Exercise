package com.example.LooselyCoupled;

import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink{

    @Override
    public void prepareDrink() {
        System.out.println("Preparing Tea");
    }
}
