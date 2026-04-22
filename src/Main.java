public static void main(String[] args) {

    Inventory inventory = new Inventory(); // Creating an inventory instance

    // Objects

    // This no longer works because Item is an abstract class.
    // We should create objects from its subclasses instead.
    // Item item1 = new Item("Apples", 15);
    // Item item2 = new Item("Sword", 2);

    Fruit fruit = new Fruit("Apple", 20, "Fuji");
    Weapon weapon = new Weapon("Sword", 2, 75, "Cutlass");

    // This is no longer necessary since we introduced the Inventory class.
    // System.out.println("Inventory \n" + "Name: " + item1.getName() + " | Quantity: " + item1.getQuantity());

    // Overloading example
    // inventory.addItem("Overloaded Apple", 30, "Apple Type");

    // inventory.addItem(item1);
    // inventory.addItem(item2);

    // Adds fruit to the inventory (polymorphism allows different item types to be handled uniformly)
    inventory.addItem(fruit);

    // Adds weapon to the inventory
    inventory.addItem(weapon);

    // Displays the inventory
    inventory.displayInventory();
}