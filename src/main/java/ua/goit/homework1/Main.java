package ua.goit.homework1;

public class Main {
    public static void main(String[] args) {
        GroceryStore groceryStore = new GroceryStore();
        Double price = groceryStore.calculateTotalCost(" ABCDABA");
        System.out.println(price);
    }
}
