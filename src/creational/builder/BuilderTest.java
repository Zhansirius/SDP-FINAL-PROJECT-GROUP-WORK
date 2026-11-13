package creational.builder;
import structural.decorator.*;
import creational.factory.*;
import behavioral.observer.*;
import creational.factory.*;

public class BuilderTest {

    public static void main(String[] args) {

        ComboMeal combo = new ComboMealBuilder()
                .setMainDish(new Pizza())
                .setDrink(new Drink())
                .setDessert(new Dessert())
                .build();

        System.out.println(combo.getName());
        System.out.println("Total: " + combo.getPrice() + " KZT");

        System.out.println("\n--- DECORATOR TEST ---");

        Dish pizza = new Pizza();

        pizza = new ExtraCheese(pizza);
        pizza = new ExtraSauce(pizza);
        pizza = new ExtraMushrooms(pizza);

        System.out.println("Dish: " + pizza.getName());
        System.out.println("Price: " + pizza.getPrice() + " KZT");

        System.out.println("\n--- OBSERVER TEST ---");

        Order order = new Order(new Pizza());

        order.addObserver(new PickupDisplay());
        order.addObserver(new MobileApp());

        order.setStatus("Preparing");
        order.setStatus("Ready for pickup");
    }
}

