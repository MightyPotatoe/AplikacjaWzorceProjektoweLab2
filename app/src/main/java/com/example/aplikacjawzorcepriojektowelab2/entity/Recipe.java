package com.example.aplikacjawzorcepriojektowelab2.entity;

public class Recipe {

    private String name;
    private String description;
    private boolean isVegan;

    public Recipe(String name, String description, boolean isVegan) {
        this.name = name;
        this.description = description;
        this.isVegan = isVegan;
    }

    public boolean isRecipeVegan(){
        return isVegan;
    }

    @Override
    public String toString() {
        return "Nazwa przepisu: " + name + "\n" +
                "Opis: " + description + "\n" +
                "Przepis wegański: " + isVegan +"\n\n";
    }
}
