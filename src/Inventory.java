import java.util.ArrayList;

// An inventory is a collection of items, so we can use an ArrayList to store and manage a group of objects
public class Inventory {

    // private ArrayList<Item> items; // ArrayList that stores Item objects
    private ArrayList<ItemInterface> items; // using interface instead of concrete class

    // Inventory constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Method to add items to the ArrayList.
    // The parameter is of type ItemInterface, allowing flexibility for different implementations.
    public void addItem(ItemInterface item) {
        items.add(item);
    }

    // OVERLOADING AND OVERRIDING

    // Overloading example
    /*
    Easier to read and improves compile-time safety because errors are caught earlier.
    It also increases flexibility.

    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    // Overloading using the Weapon class
    public void addItem(String name, int quantity, int damage, String type) {
        items.add(new Weapon(name, quantity, damage, type));
    }
    */

    // Displaying the inventory
    public void displayInventory() {
        for (ItemInterface item : items) {

            // System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());

            // Since we are using @Override, we can call displayInfo() directly
            // toString() is a built-in Java method that returns a string representation of an object.
            // It is recommended to override it in subclasses for better readability.

            // System.out.println(item.toString());

            item.displayInfo(); // calling the abstract/interface method implementation
        }
    }
}