package model;

public class Pizza extends Items {
    boolean isDelux;

    public Pizza(String name, double price, boolean isDelux){
        super(name, price);
        this.isDelux = isDelux;
    }

    @Override
    public double getHowMuch() {
        if(isDelux){
            return getPrice()+3;
        }else{
            return getPrice();
        }
    }
    //if delux add 3 bucks
}
