public class Weapon implements ItemInterface{
    private int damage;
    private String type;
    private String name;
    private int quantity;

    public Weapon(String name, int quantity, int damage, String type) {
        //super(name, quantity); //gets it from the super class
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
    public void displayInfo(){
       // we are no loger using this bc now we are using the abstract method
        // return  "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type: " + getType();
        //encapsultes the display behavior within the class
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type: " + getType());

    }

}