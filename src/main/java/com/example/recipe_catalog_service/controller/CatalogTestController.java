package com.example.recipe_catalog_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalog")
public class CatalogTestController {

    @GetMapping("/test")
    public String test() {
        return "Recipe Catalog Service is perfectly working with MongoDB!";
    }
}