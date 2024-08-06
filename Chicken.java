package Recipes;

public class Chicken extends Recipes {
    Chicken(String name, String ingrediants, int cost, int duration) {
        super(name, ingrediants, cost, duration);
    }

    @Override
    public void getRecipe() {
        System.out.println("This dish is called " + this.name);
        System.out.println("You will need the following ingrediants: " + this.ingrediants);
        System.out.println("The cost of the ingrediants is £" + this.cost + "and the time it will take to cook this recipe is " + this.duration + " minutes");
    }

}
