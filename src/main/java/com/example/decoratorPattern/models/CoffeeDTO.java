package com.example.decoratorPattern.models;

import com.example.decoratorPattern.decorators.Addons;
import com.example.decoratorPattern.products.coffee.Coffee;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.logging.log4j.message.Message;

import java.text.MessageFormat;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class CoffeeDTO {
    private int totalPrice;
    private String desc;
    private ArrayList<Addons> decorators;

    public CoffeeDTO(Coffee coffee) {
        this.decorators = new ArrayList<>(coffee.getdecorators().values());
        this.totalPrice = coffee.getPrice();
        this.init();
    }

    private void init() {
       this.desc = "It is a coffee!";
       if(decorators.isEmpty()) return;;
       this.desc +=" It contains ";

       if(this.decorators.size()>=2)
           this.decorators.subList(0,this.decorators.size()-1).forEach((addon)->{
               this.desc+= MessageFormat.format("{0}, ", addon.getType());
               this.totalPrice+=addon.getCount()*addon.getPrice();
           });

       this.desc+=MessageFormat.format("{0}.",this.decorators.getLast().getType());
        this.totalPrice+=this.decorators.getLast().getCount()*this.decorators.getLast().getPrice();
    }
}
