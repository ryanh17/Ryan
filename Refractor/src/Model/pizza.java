package model;

public class Pizza extends Items {
    boolean isDelux;

    //Requires: String, double, boolean
    //Modifies: this
    //Effects: sets name and price in Item Class. Sets isDelux to delux.
    public Pizza(String name, double price, boolean isDelux){
        super(name, price);
        this.isDelux = isDelux;
    }

    //Requires:
    //Modifies: this
    //Effects: if pasta is deluxe then add 3 dollar to price , if not deluxe, use default price
    @Override
    public double getHowMuch() {
        if(isDelux){
            return getPrice()+3;
        }else{
            return getPrice();
        }
    }
    //if delux add 3 bucks


    @Override
    public String toString() {
        return super.getName() + " -Deluxe: " + isDelux;
    }
}
