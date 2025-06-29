package com.example.decoratorPattern.products.coffee;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.decorators.coffee.CoffeeAddons;
import com.example.decoratorPattern.products.Product;

import java.util.HashMap;

public interface Coffee extends Product {
    HashMap<CoffeeAddons, Addons> getdecorators();
}
