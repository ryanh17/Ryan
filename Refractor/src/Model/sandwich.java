package model;

public class Sandwich extends Items {
    //Requires:
    //Modifies: this
    //Effects: sets SMALL to $6.5, MEDIUM to $8 and LARGE to $10.5
    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double d){price = d;}
        double getPrice() {return price;}
    }

    Size size;

    //Requires: String, Size
    //Modifies: this
    //Effects: sets name and price in Items class. Sets this.size to size.
    public Sandwich(String name, Size size){
        super(name,size.getPrice());
        this.size = size;
    }

    @Override
    public double getHowMuch() {
        return getPrice();
    }
}
