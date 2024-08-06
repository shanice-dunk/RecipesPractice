package Recipes;

class Recipes {
    protected String name;
    protected String ingrediants;
    protected int cost;
    protected int duration;

    Recipes(String name, String ingrediants, int cost, int duration) {
        this.name = name;
        this.ingrediants = ingrediants;
        this.cost = cost;
        this.duration = duration;

    }

    public void getRecipe() {
        System.out.println("This dish is called " + this.name + "which uses the following ingrediants: " + this.ingrediants + "." + "The cost of the ingrediants is: " + this.cost + "and the time is will take to cook this recipe is " + this.duration + " minutes");
    }
    
}