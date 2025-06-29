package com.example.decoratorPattern;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.decorators.coffee.*;
import com.example.decoratorPattern.models.CoffeeDTO;
import com.example.decoratorPattern.products.coffee.Coffee;
import com.example.decoratorPattern.products.coffee.PlainCoffee;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.naming.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

@Service
public class CoffeeService implements Function<CoffeeAddons[], CoffeeDTO> {

    @Autowired
    private ApplicationContext context;

    @Override
    public CoffeeDTO apply(CoffeeAddons[] addons) {
        Coffee coffee = new PlainCoffee();

        Arrays.stream(addons).forEach((addon)-> {
           this.add(addon, coffee);
        });
        return new CoffeeDTO(coffee);
    }

    private void add(CoffeeAddons addon, Coffee coffee) {
         coffee =  switch (addon) {
            case MILK -> new Milk(coffee);
            case SUGAR -> new Sugar(coffee);
            case CREAM -> new Cream(coffee);
            case CHOCO -> new Choco(coffee);
        };
    }
}
