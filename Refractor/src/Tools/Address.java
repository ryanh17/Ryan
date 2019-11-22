package tools;

public class Address {
    private int houseNum;
    private String streetName;
    private String postalCode;
    private String city;

    //Requires: int, String, String, String
    //Modifies: this
    //Effects: sets houseNum, streetName, and postalCode
    public Address(int houseNum, String streetName, String postalCode, String city) {
        this.houseNum = houseNum;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }
}
