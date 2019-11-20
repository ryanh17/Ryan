package tools.time;

public class Second implements Theticker{
    int z;
    public Second(){
        z = 0;
    }

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
    public void tick(){
        z++;
    }
}
