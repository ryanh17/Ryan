package tools.time;

public class Hour implements Theticker{
    private int x;
    Hour(){
        x = 0;
    }
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
    public void tick(){
        x++;
    }
}
