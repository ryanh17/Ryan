public class Car {
    //Fields
    private String name;
    private int year;
    private int speed;

    //Constructor
    Car(){
        System.out.println("Default Constructor");
        name = "undefined";
        year = 2018;
        speed = 0;
    }
    Car(String name, int year, int speed){
        this.name = name;
        this.year = year;
        this.speed = speed;
    }

}
