package Recipes.src;

// Abstract 

abstract class Recipes2 {
    public String name;
    public String item;

    Recipes2(String name, String mainIngredient) {
        this.name = name;
        this.item = mainIngredient;
    }

    public String getMainIngredient() {
        return item;
    }


    public abstract void getRecipe();
    
}

class Prawns extends Recipes2 {
    Prawns(String name, String mainIngredient) {
        super(name, mainIngredient);
    }

    // System.out.println(getRecipe() + getIngredients());


    public void getRecipe() {
        // Prawns prawns = new Recipes2("Lime and Chilli Prawns", "Peppers, Onions, Spring Onions, Tagliatelle, Garlic, Lime Juice", 10, 30);
        // prawns.getRecipe();
        

        System.out.println("This dish is called " + this.name);

        System.out.println("You will need the following ingredients: " + getMainIngredient());

    }
}


class Dish {
    public static void main(String[] args) {
        Recipes2 myPrawnDish = new Prawns("Lime Prawns", "Prawns");

        myPrawnDish.getRecipe();
    }
}


