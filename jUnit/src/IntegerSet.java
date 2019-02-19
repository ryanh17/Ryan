import java.util.ArrayList;

public class IntegerSet {
    ArrayList numbers;

    //Requires: int
    //Modifies: this
    //Effects: inserts integer into set unless its already there, in which case do nothing
    public void insert (Integer num){
        numbers.add(num);
    }

    //Requires: int
    //Modifies: this
    //Effects:
    public void remove (Integer num){
        numbers.remove(num);
    }
}
