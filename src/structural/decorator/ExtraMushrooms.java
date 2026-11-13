package structural.decorator;

import creational.factory.Dish;

public class ExtraMushrooms extends DishDecorator {

    public ExtraMushrooms(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Extra Mushrooms";
    }

    @Override
    public double getPrice() {
        return dish.getPrice() + 500;
    }
}