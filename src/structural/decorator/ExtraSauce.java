package structural.decorator;

import creational.factory.Dish;

public class ExtraSauce extends DishDecorator {

    public ExtraSauce(Dish dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + Extra Sauce";
    }

    @Override
    public double getPrice() {
        return dish.getPrice() + 400;
    }
}