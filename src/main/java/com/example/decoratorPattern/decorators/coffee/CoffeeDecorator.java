package com.example.decoratorPattern.decorators.coffee;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.products.coffee.Coffee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    protected CoffeeAddons type;

    @Override
    public HashMap<CoffeeAddons, Addons> getdecorators() {
        return this.coffee.getdecorators();
    }
}
