package com.example.aplikacjawzorcepriojektowelab2.repository;

import com.example.aplikacjawzorcepriojektowelab2.RecipeStorage.RecipeStorage;
import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {

    private RecipeStorage recipeStorage;

    public RecipeRepository() {
        recipeStorage = new RecipeStorage();
    }

    public ArrayList<Recipe> getListOfRecipes(){
        return recipeStorage.getRecipes();
    }
}
