// implements interface
public class Fruit implements ItemInterface{
    private String name;
    private int quantity;
    private String type;


    public Fruit(String name, int quantity, String type) {
       // super(name, quantity); // assigning the values passing as parameters from the superCLass
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }


    public String getType() {
        return type;
    }

    //overrides from ItemInterface
    @Override
    public String getName() {
        return name;
    }

    //overrides from ItemInterface
    @Override
    public int getQuantity() {
        return quantity;
    }


    // we are overriding a method that exists in ITEM (superclass).
    @Override
    // public String displayInfo() is also possible to be used. It is better to use public String displayInfo() to give the caller
    // power to decided how to use the information in return. for example: using in the UI, sout, etc.
    // by
    public void displayInfo(){
        //return  "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType();
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType());
    }
}
