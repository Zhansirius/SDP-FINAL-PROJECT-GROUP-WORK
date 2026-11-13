package creational.factory;

public class Pizza implements Dish {

    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 2800;
    }
}