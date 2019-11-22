package model;

public abstract class Items {
    private String name;
    private double howMuch;

    //Requires: String and double
    //Modifies: this
    //Effects: sets this.name to name and this.howMuch to howMuch
    public Items(String name, double howMuch) {
        this.name = name;
        this.howMuch = howMuch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getHowMuch();

    public double getPrice(){
        return howMuch;
    }

}
