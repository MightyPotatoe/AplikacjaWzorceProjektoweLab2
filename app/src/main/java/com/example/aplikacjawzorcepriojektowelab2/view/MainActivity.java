package com.example.aplikacjawzorcepriojektowelab2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.aplikacjawzorcepriojektowelab2.R;
import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;
import com.example.aplikacjawzorcepriojektowelab2.presentation.RecipePresenter;
import com.example.aplikacjawzorcepriojektowelab2.presentation.iRecipeView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements iRecipeView {

    private RecipePresenter recipePresenter;
    CheckBox onlyMeatRecipesCB;
    TextView recipesTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recipePresenter = new RecipePresenter();
        recipePresenter.onAttach(this);

        onlyMeatRecipesCB = findViewById(R.id.onlyMeatRecipesCB);


        onlyMeatRecipesCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRecipesInView(recipePresenter.refreshRecipes(onlyMeatRecipesCB.isChecked()));
            }
        });

        recipesTV = findViewById(R.id.recipesTV);
    }

    @Override
    protected void onDestroy() {
        recipePresenter.onDetach();
        super.onDestroy();
    }

    @Override
    public void showRecipesInView(ArrayList<Recipe> recipesList) {
        StringBuilder stringBuilder = new StringBuilder();
        for(Recipe recipe: recipesList){
            stringBuilder.append(recipe.toString());
        }
        recipesTV.setText(stringBuilder);
    }



}