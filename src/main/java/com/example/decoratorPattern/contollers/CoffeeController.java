package com.example.decoratorPattern.contollers;

import com.example.decoratorPattern.CoffeeService;
import com.example.decoratorPattern.decorators.coffee.CoffeeAddons;
import com.example.decoratorPattern.models.CoffeeDTO;
import com.example.decoratorPattern.products.coffee.Coffee;
import com.example.decoratorPattern.products.coffee.PlainCoffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping()
    public ResponseEntity<?> coffee() {
        return ResponseEntity.ok(Map.of("productName", "Coffee",
                                            "addons", CoffeeAddons.values()
        ));
    }

    @PostMapping()
    public CoffeeDTO getCoffee(@RequestBody CoffeeAddons[] addons) {
        return this.coffeeService.apply(addons);
    }
}
