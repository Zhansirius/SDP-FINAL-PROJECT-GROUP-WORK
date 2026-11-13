package structural.facade;

public class InventorySystem {

    public boolean checkStock(String dishName) {
        System.out.println(
                "Storage: ingredients '" + dishName + "' in stock."
        );
        return true;
    }
}