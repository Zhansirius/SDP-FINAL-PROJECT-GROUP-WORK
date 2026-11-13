package structural.decorator;

import creational.factory.Dish;

public abstract class DishDecorator implements Dish {

    protected Dish dish;

    public DishDecorator(Dish dish) {
        this.dish = dish;
    }

    @Override
    public String getName() {
        return dish.getName();
    }

    @Override
    public double getPrice() {
        return dish.getPrice();
    }
}