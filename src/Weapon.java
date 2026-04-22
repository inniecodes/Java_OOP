public class Weapon implements ItemInterface {
    private int damage;
    private String type;
    private String name;
    private int quantity;

    public Weapon(String name, int quantity, int damage, String type) {
        // super(name, quantity); // values would come from the superclass if it were used
        this.name = name;
        this.quantity = quantity;
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void displayInfo() {
        // We are no longer using a return-based approach because we are using an abstract/interface method
        // Encapsulates the display behavior within the class itself

        System.out.println(
                "Weapon: " + getName() +
                        ", Quantity: " + getQuantity() +
                        ", Damage: " + getDamage() +
                        ", Type: " + getType()
        );
    }
}