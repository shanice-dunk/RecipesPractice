package Recipes;

public class Chicken extends Recipes {
    Chicken(String name, String ingredients, int cost, int duration) {
        super(name, ingredients, cost, duration);
    }

    @Override
    public void getRecipe() {
        System.out.println("This dish is called " + this.name);
        System.out.println("You will need the following ingredients: " + this.ingredients); 
        System.out.println("The cost of the ingredients is £" + this.cost + " and the time it will take to cook this recipe is " + this.duration + " minutes.");
    }
}
