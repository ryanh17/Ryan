package tools.time;

public class Hour implements TheTicker {
    private int x;

    //Requires:
    //Modifies: this
    //Effects: sets x (hours) to 0
    Hour(){
        x = 0;
    }

    //Requires: int
    //Modifies: this
    //Effects: sets this.x to x
    public Hour(int x){
        this.x = x;
    }

    public int getHour() {
        return x;
    }

    public void setHour(int x) {
        this.x = x;
    }
    public String toString(){
        if(x < 10){
            return "0"+x;
        }
        else
            return Integer.toString(x);
    }

    //Requires:
    //Modifies: this
    //Effects: adds one hour
    public void tick(){
        x++;
    }
}
