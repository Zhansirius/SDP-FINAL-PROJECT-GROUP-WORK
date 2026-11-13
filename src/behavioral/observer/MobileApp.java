package behavioral.observer;

public class MobileApp implements OrderObserver {

    @Override
    public void update(String dishName, String status) {
        System.out.println(
                "Mobile app: " + dishName + " - " + status
        );
    }
}