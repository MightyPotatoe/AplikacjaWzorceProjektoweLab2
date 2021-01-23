package com.example.aplikacjawzorcepriojektowelab2.presentation;

import com.example.aplikacjawzorcepriojektowelab2.domain.GetRecipes;
import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipePresenter {

    private GetRecipes getRecipes;
    private iRecipeView iRecipeView;

    public RecipePresenter() {
        getRecipes = new GetRecipes();
    }

    public void onAttach(iRecipeView recipeView){
        this.iRecipeView = recipeView;
    }

    public void onDetach(){
        iRecipeView = null;
    }

    public ArrayList<Recipe> refreshRecipes(boolean isWithMeat){
        return getRecipes.getRecipes(isWithMeat);
    }



}
