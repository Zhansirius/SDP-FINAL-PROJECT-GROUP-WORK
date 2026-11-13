package creational.factory;

public class PizzaFactory extends DishFactory {

    @Override
    public Dish createDish() {
        return new Pizza();
    }
}