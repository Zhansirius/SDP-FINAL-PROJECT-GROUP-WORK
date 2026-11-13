package creational.builder;

import creational.factory.Dish;

public class ComboMeal implements Dish {

    private final Dish mainDish;
    private final Dish drink;
    private final Dish dessert;

    ComboMeal(Dish mainDish, Dish drink, Dish dessert) {
        this.mainDish = mainDish;
        this.drink = drink;
        this.dessert = dessert;
    }

    @Override
    public String getName() {
        String name = "Combo Meal: " + mainDish.getName();

        if (drink != null) {
            name += ", " + drink.getName();
        }

        if (dessert != null) {
            name += ", " + dessert.getName();
        }

        return name;
    }

    @Override
    public double getPrice() {
        double total = mainDish.getPrice();

        if (drink != null) {
            total += drink.getPrice();
        }

        if (dessert != null) {
            total += dessert.getPrice();
        }

        return total;
    }
}