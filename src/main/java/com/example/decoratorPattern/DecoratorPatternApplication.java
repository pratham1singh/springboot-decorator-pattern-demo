package com.example.decoratorPattern;

import com.example.decoratorPattern.decorators.coffee.Cream;
import com.example.decoratorPattern.decorators.coffee.Milk;
import com.example.decoratorPattern.decorators.coffee.Sugar;
import com.example.decoratorPattern.products.coffee.Coffee;
import com.example.decoratorPattern.products.coffee.PlainCoffee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorPatternApplication.class, args);
	}
}
