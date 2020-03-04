package com.example.LooselyCoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    @Autowired
    private HotDrink hotDrink;

    //Constructor Injection

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }


}
