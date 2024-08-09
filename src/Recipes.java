package Recipes.src;

// Inheritance 

public class Recipes {
    
    public String name;
    public String ingredients; 
    public int cost;
    public int duration;

    Recipes(String name, String ingredients, int cost, int duration) {
        this.name = name;
        this.ingredients = ingredients;
        this.cost = cost;
        this.duration = duration;
    }


    public void getRecipe() {
        System.out.println("This dish is called " + this.name + " which uses the following ingredients: " + this.ingredients + ". " + "The cost of the ingredients is: £" + this.cost + " and the time it will take to cook this recipe is " + this.duration + " minutes.");
        }
    
    public static void main(String[] args) {
        Recipes prawns = new Recipes("Lime and Chilli Prawns", "Prawns, Peppers, Onions, Spring Onions, Tagliatelle, Garlic, Chilli Flakes, Lime Juice", 10, 30);
      prawns.getRecipe();

      Recipes chicken = new Recipes("Jerk Chicken", "Chicken, Jerk Seasoning, Peppers, Onions, Spring Onions, Rice", 10, 60);
      chicken.getRecipe();

      Recipes lamb = new Recipes("Lamb Stew", "Lamb, Peppers, Onions, Spring Onions, Coconut Milk, Seasonings", 15, 60);
      lamb.getRecipe();

        
    }

}

