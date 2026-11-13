package creational.builder;

import creational.factory.Dish;

public class ComboMealBuilder {

    private Dish mainDish;
    private Dish drink;
    private Dish dessert;

    public ComboMealBuilder setMainDish(Dish mainDish) {
        this.mainDish = mainDish;
        return this;
    }

    public ComboMealBuilder setDrink(Dish drink) {
        this.drink = drink;
        return this;
    }

    public ComboMealBuilder setDessert(Dish dessert) {
        this.dessert = dessert;
        return this;
    }

    public ComboMeal build() {
        if (mainDish == null) {
            throw new IllegalStateException(
                    "Main dish is required!"
            );
        }

        return new ComboMeal(mainDish, drink, dessert);
    }
}