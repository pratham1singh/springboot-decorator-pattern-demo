package com.example.decoratorPattern.decorators.coffee;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.products.coffee.Coffee;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

public class Cream extends CoffeeDecorator{
    private final int price = 30;
    private final String desc = "I am cream decorator";

    public Cream(Coffee coffee) {
        super(coffee, CoffeeAddons.CREAM);

        Addons creamAddon =  this.coffee.getdecorators().getOrDefault(this.type,new Addons(this.price, 0, this.desc, this.type.toString()));
        creamAddon.add(1);
        this.coffee.getdecorators().put(this.type, creamAddon);
    }

    @Override
    public String getDescription() {
        return this.desc;
    }

    @Override
    public int getPrice() {
        return this.coffee.getPrice() + this.price;
    }
}
