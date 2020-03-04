package com.example.LooselyCoupled;

import org.springframework.stereotype.Component;

@Component
public class ExpressTea  implements HotDrink{

    @Override
    public void prepareDrink() {
        System.out.println("Preparing Express Tea");
    }
}
