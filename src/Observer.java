import java.util.ArrayList;
import java.util.List;
import creational.factory.Dish;
interface OrderObserver {
    void update(String dishName, String status);
}

class PickupDisplay implements OrderObserver {
    @Override
    public void update(String dishName, String status) {
        System.out.println("Pickup display: " + dishName + " - " + status);
    }
}

class MobileApp implements OrderObserver {
    @Override
    public void update(String dishName, String status) {
        System.out.println("Mobile app: " + dishName + " - " + status);
    }
}

class Order {
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
}

// The existing facade returns void, so we remember the payment result.
class PaymentCheck implements PaymentStrategy {
    private PaymentStrategy payment;
    private boolean successful;

    public PaymentCheck(PaymentStrategy payment) {
        this.payment = payment;
    }

    @Override
    public boolean pay(double amount) {
        successful = payment.pay(amount);
        return successful;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
