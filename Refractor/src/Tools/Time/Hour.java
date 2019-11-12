package Tools.Time;

public class Hour implements Theticker{
    private int x;
    Hour(){
        x = 0;
    }
    public Hour(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public String toString(){
        if(x < 10){
            return "0"+x;
        }
        else
            return ""+x;
    }
    public void tick(){
        x++;
    }
}
