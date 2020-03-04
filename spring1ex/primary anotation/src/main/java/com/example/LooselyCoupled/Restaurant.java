package com.example.LooselyCoupled;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {


    private HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
           this.hotDrink = hotDrink;
    }
}
