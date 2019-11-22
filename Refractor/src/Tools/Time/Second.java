package tools.time;

public class Second implements TheTicker {
    int z;

    //Requires:
    //Modifies: this
    //Effects: sets z to 0 seconds
    public Second(){
        z = 0;
    }

    //Requires: int
    //Modifies: this
    //Effects: sets this.z to z
    public Second(int z) {
        this.z = z;
    }

    public int getSeconds() {
        return z;
    }

    public void setSeconds(int z) {
        this.z = z;
    }


    public String toString(){
        if(z < 10){
            return "0"+z;
        }
        else
            return Integer.toString(z);
    }

    //Requires:
    //Modifies: this
    //Effects: adds one second
    public void tick(){
        z++;
    }
}
