package com.example.aplikacjawzorcepriojektowelab2.domain;

import com.example.aplikacjawzorcepriojektowelab2.RecipeStorage.RecipeStorage;
import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;
import com.example.aplikacjawzorcepriojektowelab2.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;

public class GetRecipes {

    public ArrayList<Recipe> getRecipes(boolean isWithMeat){
        //Inicjalizacja RecipeRepository
        RecipeRepository recipeRepository = new RecipeRepository();
        //Pobranie listy wszystkich przepisów
        ArrayList<Recipe> recipeList = recipeRepository.getListOfRecipes();
        ArrayList<Recipe> filteredList = new ArrayList<>();
        //Filtrowanie przepisów
        for(int i = 0; i < recipeList.size(); i++){
            if(recipeList.get(i).isRecipeVegan() != isWithMeat){
                filteredList.add(recipeList.get(i));
            }
        }
        return filteredList;
    }

}
