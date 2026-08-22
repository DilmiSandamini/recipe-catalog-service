package com.example.recipe_catalog_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@Document(collection = "recipes")
public class Recipe {

    @Id
    private String id;
    private String title;
    private String description;
    private List<String> ingredients;
    private List<String> instructions;

}