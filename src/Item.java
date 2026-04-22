// Template used to create new inventory items

// PREVIOUS VERSION:
// This was the original abstract class used before introducing interfaces.
// It was responsible for sharing common attributes like name and quantity.
//
// CURRENT VERSION:
// We are now using ItemInterface instead of extending this class
// to demonstrate a different design approach (interface-based).

public abstract class Item {
    private String name;
    private int quantity;

    // Constructor
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // This method can be used in subclasses like Fruit and Weapon
    // by overriding it and adding specific behavior as needed.
    // Since this class is now abstract, this method may no longer be required in the new design.
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity;
    }

    public abstract void displayInfo();
}