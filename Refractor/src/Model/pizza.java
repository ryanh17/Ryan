package Model;

public class pizza extends items{
    boolean isDelux;

    pizza(String name, double price, boolean isDelux){
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
