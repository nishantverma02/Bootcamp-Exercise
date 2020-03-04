package com.example.LooselyCoupled;

public class Tea implements HotDrink{

    @Override
    public void prepareDrink() {
        System.out.println("Preparing Tea");
    }
}
