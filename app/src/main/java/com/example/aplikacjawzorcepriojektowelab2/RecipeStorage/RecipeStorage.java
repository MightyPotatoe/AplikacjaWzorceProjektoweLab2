package com.example.aplikacjawzorcepriojektowelab2.RecipeStorage;

import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeStorage {

    public ArrayList<Recipe> getRecipes(){
        ArrayList<Recipe> recipesList = new ArrayList<>();
        recipesList.add(new Recipe("Mielone z ziemniakami", "Przepis na kotlety mielone z ziemniakami", false));
        recipesList.add(new Recipe("Spaghetti Bolognese", "Przpis na spaghetti bolognese", false));
        recipesList.add(new Recipe("Kurczak w cieście na ostro", "Przepis na kurczaka w cieście na ostro z Radomia", false));
        recipesList.add(new Recipe("Zapiekane tofu z pierczarkami", "Przepis na zapiekane tofu z pieczarkami", true));
        recipesList.add(new Recipe("Makaron z ciecierzycą", "Przepis na makaron z ciecierzycą", true));
        recipesList.add(new Recipe("Wegańskie danie z czymś wegańskim", "Przepis na wegańskie danie z wegańskimi składnikami :)", true ));
        return recipesList;
    }
}
