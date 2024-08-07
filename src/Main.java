package Recipes.src;

public class Main {
    public static void main(String[] args) {
        Prawns prawns = new Prawns("Lime and Chilli Prawns", "Prawns, Peppers, Onions, Spring Onions, Tagliatelle, Garlic, Chilli Flakes, Lime Juice", 10, 30);
        prawns.getRecipe();

        Chicken chicken = new Chicken("Jerk Chicken", "Chicken, Jerk Seasoning, Peppers, Onions, Spring Onions, Rice", 10, 60);
        chicken.getRecipe();
    }

}
