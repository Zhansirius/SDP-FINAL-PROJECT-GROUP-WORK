import creational.factory.*;
import creational.builder.*;
import structural.decorator.*;
import structural.facade.*;
import behavioral.strategy.*;
import behavioral.observer.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("RESTAURANT SYSTEM");

        //factory
        System.out.println("\n! FACTORY METHOD !");

        Dish pizza = new PizzaFactory().createDish();
        Dish drink = new DrinkFactory().createDish();
        Dish dessert = new DessertFactory().createDish();

        //builder
        System.out.println("\n! BUILDER !");

        ComboMeal combo = new ComboMealBuilder()
                .setMainDish(pizza)
                .setDrink(drink)
                .setDessert(dessert)
                .build();

        System.out.println("Combo: " + combo.getName());
        System.out.println("Price: " + combo.getPrice() + " KZT");

        // decorator
        System.out.println("\n! DECORATOR !");

        Dish decoratedCombo = new ExtraCheese(
                new ExtraSauce(combo)
        );

        System.out.println("Dish: " + decoratedCombo.getName());
        System.out.println("Price: " + decoratedCombo.getPrice() + " KZT");

        // strategy
        System.out.println("\n! STRATEGY !");

        PaymentStrategy payment = new PayByCard();

        //facade && observer
        System.out.println("\n! ORDER PROCESSING !");

        OrderFacade facade = new OrderFacade();

        Order order = facade.placeOrder(
                decoratedCombo,
                payment,
                new PickupDisplay(),
                new MobileApp()
        );

        // observer
        if (order != null) {
            order.setStatus("Ready for pickup");
        }

        System.out.println("\nEND OF DEMONSTRATION");
    }
}