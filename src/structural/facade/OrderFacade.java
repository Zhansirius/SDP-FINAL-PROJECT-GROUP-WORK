package structural.facade;

import behavioral.strategy.PaymentStrategy;

public class OrderFacade {

    private InventorySystem inventory;
    private KitchenSystem kitchen;

    public OrderFacade() {
        inventory = new InventorySystem();
        kitchen = new KitchenSystem();
    }

    public void placeOrder(
            String dishName,
            double price,
            PaymentStrategy paymentMethod) {

        System.out.println("\nOrdering: " + dishName);

        if (!inventory.checkStock(dishName)) {
            System.out.println("Order canceled. Not enough ingredients.");
            return;
        }

        if (!paymentMethod.pay(price)) {
            System.out.println("Payment canceled.");
            return;
        }

        kitchen.startCooking(dishName);
        System.out.println("Order cooking started.");
    }
}