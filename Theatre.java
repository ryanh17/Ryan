public class Theatre {
    private IntegerSet seatsRemaining;
    private IntegerSet occupiedSeats;
    private IntegerSet aisleSeats;
    private int totalRows;

    Theatre(int totalSeats, int[] firstRowAisleSeats, int rows){
        seatsRemaining = new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for(int i = 0; i < totalSeats; i++){
            seatsRemaining.insert(i+1);
        }
        for(Integer n : firstRowAisleSeats){
            aisleSeats.insert(n);
        }
        totalRows = rows;
    }

    //Default
    Theatre(){
        seatsRemaining = new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for(int i = 0; i < 120; i++){
            seatsRemaining.insert(i+1);
        }
        totalRows = 10;
    }

    //Requires: integer, seat num
    //Modifies: this
    //Effects: if the seat is remaining, remove seat from IntegerSet and add it to occupied
    //IntegerSet. Else do nothing.
    public void purchaseSeat(Integer seatNum){
        if (seatsRemaining.contains(seatNum)){
            occupiedSeats.insert(seatNum);
            seatsRemaining.remove(seatNum);
        }
    }

    //Effects: returns the remaining seats in the theatre
    public IntegerSet seatsRemaing(){
        return seatsRemaining;
    }

    //Requires: integer, seat num
    //Effects: return true if seat is on Aisle, else return false
    public boolean isAisle(Integer seatNum){
        int seatsPerRow = getSize() / totalRows;
        return aisleSeats.contains(seatNum % seatsPerRow);
    }

    //Requires: integer, seat num
    //Effects: return true if seat is purchased, else return false
    public boolean isPurchased(Integer num){
        return occupiedSeats.contains(num);
    }

    //Effects: returns num of remaining seats
    public int getSize(){
        return seatsRemaining.size();
    }
}
