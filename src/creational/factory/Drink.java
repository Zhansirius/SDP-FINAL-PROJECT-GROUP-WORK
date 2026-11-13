package creational.factory;

public class Drink implements Dish {

    @Override
    public String getName() {
        return "Drink";
    }

    @Override
    public double getPrice() {
        return 800;
    }
}