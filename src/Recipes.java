package Recipes.src;

public class Recipes {
    protected String name;
    protected String ingredients; 
    protected int cost;
    protected int duration;

    Recipes(String name, String ingredients, int cost, int duration) {
        this.name = name;
        this.ingredients = ingredients;
        this.cost = cost;
        this.duration = duration;
    }

    public void getRecipe() {
        System.out.println("This dish is called " + this.name + " which uses the following ingredients: " + this.ingredients + ". " + "The cost of the ingredients is: " + this.cost + " and the time it will take to cook this recipe is " + this.duration + " minutes.");
    }
}
