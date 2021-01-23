package com.example.aplikacjawzorcepriojektowelab2;

import com.example.aplikacjawzorcepriojektowelab2.domain.GetRecipes;
import com.example.aplikacjawzorcepriojektowelab2.entity.Recipe;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void DomainGetRecipes() {
        GetRecipes getRecipes = new GetRecipes();
        ArrayList<Recipe> meatMealsList = getRecipes.getRecipes(true);
        Assert.assertFalse(meatMealsList.get(0).isRecipeVegan());
        Assert.assertFalse(meatMealsList.get(1).isRecipeVegan());
        Assert.assertFalse(meatMealsList.get(2).isRecipeVegan());

        List<Recipe> veganMealsList = getRecipes.getRecipes(false);
        Assert.assertTrue(veganMealsList.get(0).isRecipeVegan());
        Assert.assertTrue(veganMealsList.get(1).isRecipeVegan());
        Assert.assertTrue(veganMealsList.get(2).isRecipeVegan());
    }
}