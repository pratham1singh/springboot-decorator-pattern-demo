package com.example.decoratorPattern.products.coffee;


import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.decorators.coffee.CoffeeAddons;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;


@NoArgsConstructor
@AllArgsConstructor
public class PlainCoffee implements Coffee {
    private final int price = 100;
    private final String desc = "I am coffee";
    private  HashMap<CoffeeAddons, Addons> decorators = new  HashMap<CoffeeAddons, Addons>();

    @Override
    public String getDescription() {
        return this.desc;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public HashMap<CoffeeAddons, Addons> getdecorators() {
        return this.decorators;
    }
}
