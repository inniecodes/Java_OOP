// template used to created new inventories

// PREVIOUS VERSION:
// This was the original abstract class used before introducing interfaces.
// It was responsible for sharing attributes like name and quantity.
//
// CURRENT VERSION:
// We are now using ItemInterface instead of extending this class,
// to demonstrate a different design approach (interface-based).

public abstract class Item {
    private String name;
    private  int quantity;

    // constructor
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // we are going to use this in FRUIT and WEAPON and any other classes by overriding it and adding stuff we need
    // as item is now an abstract class, we will no long need this
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity;
    }

    public abstract void displayInfo();
}
