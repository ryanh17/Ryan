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

    public Kitchen(String name){
        this.name = name;
        startStuff();
    }

    public void startStuff(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    private void makePizza() {
        inventory.add(new Pizza("Pizza", 20, true));
    }
    private void makePasta(){
        inventory.add(new Pasta("Pasta", 15, false));
    }
    private void makeSandwich(){
        inventory.add(new Sandwich("Sandwich", Sandwich.Size.SMALL));
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }
}
