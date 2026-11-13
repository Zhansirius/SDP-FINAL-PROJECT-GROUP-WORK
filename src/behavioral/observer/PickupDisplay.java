package behavioral.observer;

public class PickupDisplay implements OrderObserver {

    @Override
    public void update(String dishName, String status) {
        System.out.println(
                "Pickup display: " + dishName + " - " + status
        );
    }
}