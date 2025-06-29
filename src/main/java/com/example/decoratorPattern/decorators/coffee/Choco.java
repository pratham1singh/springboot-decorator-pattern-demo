package com.example.decoratorPattern.decorators.coffee;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.products.coffee.Coffee;


public class Choco extends CoffeeDecorator{
    private final int price = 25;
    private final String desc = "I am choco decorated coffee";

    public Choco(Coffee coffee) {
        super(coffee, CoffeeAddons.CREAM);

        Addons chocoAddon =  this.coffee.getdecorators().getOrDefault(this.type,new Addons(this.price, 0, this.desc, this.type.toString()));
        chocoAddon.add(1);
        this.coffee.getdecorators().put(this.type, chocoAddon);
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
