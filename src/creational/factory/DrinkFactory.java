package creational.factory;

public class DrinkFactory extends DishFactory {

    @Override
    public Dish createDish() {
        return new Drink();
    }
}