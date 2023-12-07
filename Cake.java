

// Subclass for Cake
import java.io.*;

class Cake extends Product {
    String flavor;

    public Cake(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }


    // Method to add Cake to the menu
    public void addCake(String name, double price, String flavor) {
        menuItems.add(new Cake(name, price, flavor));
        saveMenuToFile(); // Automatically save to file after adding an item
    }

    @Override
    public void display(){
        System.out.println("Cake Name: " + name + ", Price: " + price + ", Flavor: " + flavor);
    }
    @Override
    public void addproject() {
        // TODO Auto-generated method stub
        super.addproject();
        System.out.println("Hi?");
        System.out.println("Commit Github");

    }
}

