package structural.facade;

import behavioral.observer.*;
import behavioral.strategy.PaymentStrategy;
import creational.factory.Dish;

public class OrderFacade {

    private final InventorySystem inventory;
    private final KitchenSystem kitchen;

    public OrderFacade() {
        inventory = new InventorySystem();
        kitchen = new KitchenSystem();
    }

    public Order placeOrder(
            Dish dish,
            PaymentStrategy paymentMethod,
            OrderObserver... observers) {

        System.out.println("\nOrdering: " + dish.getName());

        if (!inventory.checkStock(dish.getName())) {
            System.out.println("Order canceled. Not enough ingredients.");
            return null;
        }

        if (!paymentMethod.pay(dish.getPrice())) {
            System.out.println("Payment canceled.");
            return null;
        }

        Order order = new Order(dish);

        for (OrderObserver observer : observers) {
            order.addObserver(observer);
        }

        kitchen.startCooking(dish.getName());

        order.setStatus("Preparing");

        System.out.println("Order cooking started.");

        return order;
    }
}