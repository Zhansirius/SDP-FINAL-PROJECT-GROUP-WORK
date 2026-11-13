package structural.decorator;

import creational.factory.Dish;

public class ExtraCheese extends DishDecorator {

    public ExtraCheese(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return dish.getPrice() + 500;
    }
}