package creational.factory;

public class Dessert implements Dish {

    @Override
    public String getName() {
        return "Dessert";
    }

    @Override
    public double getPrice() {
        return 1500;
    }
}