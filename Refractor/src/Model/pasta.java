package model;

public class Pasta extends Items {
    boolean isDelux;

    //Requires: String, double, boolean
    //Modifies: this
    //Effects: sets name and price in Item Class. Sets isDelux to delux.
    public Pasta(String name, double price, boolean delux){
        super(name, price);
        isDelux = delux;
    }

    //Requires:
    //Modifies: this
    //Effects: if pasta is deluxe then add 2 dollar to price , if not deluxe, use default price
    @Override
    public double getHowMuch() {
        //if delux add 2 bucks
        if (isDelux) {
            return getPrice() + 2;
        } else {
            return getPrice();
        }
    }
}
