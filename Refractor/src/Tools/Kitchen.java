package tools;

import model.Items;
import model.Pasta;
import model.Pizza;
import model.Sandwich;

import java.util.ArrayList;

public class Kitchen {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Items> inventory = new ArrayList<>();

    //Requires: String
    //Modifies: this
    //Effects: sets kitchen name, and calls method startStuff()
    public Kitchen(String name){
        this.name = name;
        startStuff();
    }

    //Requires:
    //Modifies: this
    //Effects: calls the methods makePizza, makePasta, and makeSandwich 5 times
    public void startStuff(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    //Requires:
    //Modifies: this
    //Effects: adds new $20 deluxe pizza to inventory
    private void makePizza() {
        inventory.add(new Pizza("Pizza", 20, true));
    }

    //Requires:
    //Modifies: this
    //Effects: adds new $15 pasta to inventory
    private void makePasta(){
        inventory.add(new Pasta("Pasta", 15, false));
    }

    //Requires:
    //Modifies: this
    //Effects: adds new small sandwich to inventory
    private void makeSandwich(){
        inventory.add(new Sandwich("Sandwich", Sandwich.Size.SMALL));
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }
}
