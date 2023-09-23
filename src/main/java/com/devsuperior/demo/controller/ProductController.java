package com.devsuperior.demo.controller;

import com.devsuperior.demo.entities.Departament;
import com.devsuperior.demo.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @GetMapping
    public List<Product> getProducts() {
        Departament tech = new Departament(1L, "Tech");
        Departament pet = new Departament(2L, "Pet");

        List<Product> products = Arrays.asList(
                new Product(1L, "Macbook Pro", 4000.0, tech),
                new Product(2L, "Pc Gamer", 5000.0, tech),
                new Product(3L, "Pet House", 300.0, pet),
                new Product(4L, "Smartphone", 1000.0, tech),
                new Product(5L, "Tablet", 600.0, tech),
                new Product(6L, "Headphones", 100.0, tech),
                new Product(7L, "Mouse", 50.0, tech),
                new Product(8L, "Keyboard", 70.0, tech),
                new Product(9L, "Dog Food", 20.0, pet),
                new Product(10L, "Cat Food", 15.0, pet),
                new Product(11L, "Fish Tank", 80.0, pet),
                new Product(12L, "Dog Leash", 10.0, pet),
                new Product(13L, "Cat Toy", 5.0, pet),
                new Product(14L, "Gaming Chair", 200.0, tech),
                new Product(15L, "Smart TV", 800.0, tech)
        );

        return products;
    }
}
