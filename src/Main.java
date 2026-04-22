//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

    Inventory inventory = new Inventory(); // Creating an inventory Called inventory

    // objects

    // it does not work because now item is an abstract class. we want to create objects from the subclasses of the super class Item
    //Item item1 = new Item("Apples", 15);
    //Item item2 = new Item("Sword", 2);

    Fruit fruit = new Fruit("Apple", 20, "Fuji");
    Weapon weapon = new Weapon("Sword", 2, 75, "Cutlass");
    // this is not necessary anymore as we created the inventory
    //System.out.println("Inventory \n" + "Name: " + item1.getName() + " | Quantity: " + item1.getQuantity());

    // overloading format
    //inventory.addItem(" Overloading Apple", 30, "Overloading Apple Type");

    //inventory.addItems(item1);
    //inventory.addItems(item2);

    // adds fruit to the inventory but does not prints the type yet. polymorphism helps us with it when we use @override :)
    inventory.addItem(fruit);
    // adds weapon
    inventory.addItem(weapon);
    //shows the inventory
    inventory.displayInventory();

}
