// implements interface
public class Fruit implements ItemInterface {
    private String name;
    private int quantity;
    private String type;

    public Fruit(String name, int quantity, String type) {
        // super(name, quantity); // assigning values passed as parameters from the superclass
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    // overrides method from ItemInterface
    @Override
    public String getName() {
        return name;
    }

    // overrides method from ItemInterface
    @Override
    public int getQuantity() {
        return quantity;
    }

    // we are overriding a method that exists in Item (superclass)
    @Override
    // public String displayInfo() is also possible. However, void is used here because the method directly prints the output.
    // Returning a String would give the caller more flexibility on how to use the information (e.g., UI, logs, System.out, etc.)
    public void displayInfo() {
        System.out.println(
                "Fruit: " + getName() +
                        ", Quantity: " + getQuantity() +
                        ", Type: " + getType()
        );
    }
}