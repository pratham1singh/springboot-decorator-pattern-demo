package com.example.decoratorPattern.decorators.coffee;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.products.coffee.Coffee;

public class Sugar extends CoffeeDecorator {
    private final int price = 10;
    private final String desc = "I am sugar decorator";

    public Sugar(Coffee coffee) {
        super(coffee, CoffeeAddons.SUGAR);

        Addons sugarAddon =  this.coffee.getdecorators().getOrDefault(this.type,new Addons(this.price, 0, this.desc, this.type.toString()));
        sugarAddon.add(1);
        this.coffee.getdecorators().put(this.type, sugarAddon);
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
