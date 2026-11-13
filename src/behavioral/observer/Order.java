package behavioral.observer;

import creational.factory.Dish;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Dish dish;
    private String status = "Created";

    private List<OrderObserver> observers = new ArrayList<>();

    public Order(Dish dish) {
        this.dish = dish;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;

        for (OrderObserver observer : observers) {
            observer.update(dish.getName(), this.status);
        }
    }

    public String getStatus() {
        return status;
    }
}