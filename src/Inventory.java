import java.util.ArrayList;

// an inventary is a collection of items, therefore, i can use an  ArrayList in order to work with a collection of objects
public class Inventory {
   //private ArrayList<Item> items; // an array list will reCieve Item and it will store a list of itens
    private ArrayList<ItemInterface> items; // creating an interface here

    // inventory ConstruCtor

    public Inventory() {
        items = new ArrayList<>();
    }

    // method to add items to the ArrayList, the paramter of this is the ArrayList, in order to use the method add, we must add the parameter Item (Class)
    // add items to the CLASS ITEM, using the arrylist items

    public void addItem(ItemInterface item){
        items.add(item);
    }


    // OVERLOADING AND OVERRIDE

    // overloading
    /* easier to read, compiled time is better because the errors are going to be called out in compie time, it increases flexibility.
    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }

    //overloading using the Weapon class
    public void addItem(String name, int quantity, int damage, String type){
        items.add(new Weapon(name, quantity, damage, type));
    }*/


    // displaying the inventory
    public void displayInventory(){
        for (ItemInterface item : items){

            //System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());

            // As we are using  @override we are going to use the method toString()
            // toString() is a built in method in java. it returns the representation of the object. it is recommended to override this method in the subclasses

            //System.out.println(item.toString());

            item.displayInfo(); // now we can use the displayInfo() abstrat method here
            }
    }


}
