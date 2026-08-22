package com.example.recipe_catalog_service.service;

import com.example.recipe_catalog_service.model.Recipe;
import com.example.recipe_catalog_service.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe updateRecipe(String id, Recipe updatedRecipe) {
        updatedRecipe.setId(id);
        return recipeRepository.save(updatedRecipe);
    }

    public void deleteRecipe(String id) {
        recipeRepository.deleteById(id);
    }
}