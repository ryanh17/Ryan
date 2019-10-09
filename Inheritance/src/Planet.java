import java.util.ArrayList;

public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons = new ArrayList<>();
    private String designation;

    Planet(){
    }

    Planet(int orbitTime, String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    public void addMoons(Moon moon) {
        this.moons.add(moon);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "";
    }
}
