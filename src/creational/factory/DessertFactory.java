package creational.factory;

public class DessertFactory extends DishFactory {

    @Override
    public Dish createDish() {
        return new Dessert();
    }
}