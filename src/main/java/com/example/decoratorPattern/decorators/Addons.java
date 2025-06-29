package com.example.decoratorPattern.decorators;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Addons {
    private int price;
    private int count;
    private String desc;
    private String type;

    public void add(int q) {
        this.count+=q;
    }
}
