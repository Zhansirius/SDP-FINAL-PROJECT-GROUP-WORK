public class OrderFacade {
    private InventorySystem inventory;
    private KitchenSystem kitchen;

    public OrderFacade() {
        this.inventory = new InventorySystem();
        this.kitchen = new KitchenSystem();
    }

    // Takes payment strategy
    public void placeOrder(String dishName, double price, PaymentStrategy paymentMethod) {
        System.out.println("\nOderding: " + dishName);

        // Checking storage
        if (!inventory.checkStock(dishName)) {
            System.out.println("Order canceled. Not enough ingredients.");
            return;
        }

        // Making payment
        if (!paymentMethod.pay(price)) {
            System.out.println("Payment canceled.");
            return;
        }

        // Providing order to kitchen
        kitchen.startCooking(dishName);
        System.out.println("Order cooking started");
    }
}