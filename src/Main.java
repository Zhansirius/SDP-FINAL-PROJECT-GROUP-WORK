import structural.facade.OrderFacade;
import behavioral.strategy.*;
import creational.factory.*;
import creational.builder.*;
import structural.decorator.*;
import behavioral.observer.*;
public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Steak", 8500.0, new PayByCard());
        orderFacade.placeOrder("Pasta", 3200.0, new PayByQr());
    }
}