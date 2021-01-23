package com.example.aplikacjawzorcepriojektowelab2.presentation;

import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

public interface iRecipeView {
    void showRecipesInView(ArrayList<Recipe> recipesList);
}
