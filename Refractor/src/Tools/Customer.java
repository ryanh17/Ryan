package tools;

public class Customer {
    String name;
    Address address;

    //Requires: String, Address
    //Modifies: this
    //Effects: name and address
    Customer(String name, Address address){
        this.name = name;
        this.address = address;
    }
}
