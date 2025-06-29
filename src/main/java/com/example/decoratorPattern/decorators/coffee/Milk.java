package com.example.decoratorPattern.decorators.coffee;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.products.coffee.Coffee;
import org.springframework.stereotype.Component;

public class Milk extends CoffeeDecorator{
    private final int price = 50;
    private final String desc = "I am milk decorated coffee";

    public Milk(Coffee coffee) {
        super(coffee, CoffeeAddons.MILK);

        Addons milkAddon =  this.coffee.getdecorators().getOrDefault(this.type,new Addons(this.price, 0, this.desc, this.type.toString()));
        milkAddon.add(1);
        this.coffee.getdecorators().put(this.type, milkAddon);
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
