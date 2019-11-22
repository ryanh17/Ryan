package tools.time;

public class Minute implements TheTicker {
    int y;

    //Requires:
    //Modifies: this
    //Effects: sets y to 0 minutes
    public Minute(){
        y = 0;
    }

    //Requires: int
    //Modifies: this
    //Effects: sets this.y to y
    public Minute(int y) {
        this.y = y;
    }

    public int getMinute() {
        return y;
    }

    public void setMinute(int y) {
        this.y = y;
    }
    public String toString(){
        if(y < 10){
            return "0"+y;
        }
        else
            return Integer.toString(y);
    }

    //Requires:
    //Modifies: this
    //Effects: adds one minute
    public void tick(){
        y++;
    }
}
