import java.util.ArrayList;

public class IntegerSet {
    ArrayList numbers = new ArrayList();

    //Requires: int
    //Modifies: this
    //Effects: inserts integer into set unless its already there, in which case do nothing
    public void insert (Integer num){
        if (contains(num) == false){
            numbers.add(num);
        }
    }

    //Requires: int
    //Modifies: this
    //Effects: if the integer is in the set remove it, otherwise do nothing
    public void remove (Integer num){
        if(contains(num) == true){
            for(int x = 0; x <= numbers.size() - 1; x++){
                if (numbers.get(x).equals(num)){
                    numbers.remove(x);
                }
            }
        }
    }

    //Requires: null
    //Modifies: this
    //Effects: return numbers ArrayList size
    public int size() {
        return numbers.size();
    }

    //Requires: int
    //Modifies: this
    //Effects: if set contains the integer, return true, otherwise return false
    public boolean contains(int i) {
        for (int x = 0; x <= numbers.size() - 1; x++){
            if (numbers.get(x).equals(i)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
