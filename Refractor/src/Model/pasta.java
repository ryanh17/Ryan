package model;

public class Pasta extends Items {
    boolean isDelux;

    public Pasta(String name, double price, boolean delux){
        super(name, price);
        isDelux = delux;
    }

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
