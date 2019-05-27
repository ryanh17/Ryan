package sample;

public class Friend {
    private String name;
    private String ph;
    private int b_Month;
    private int b_Day;
    private int b_Year;

    Friend(String name, String ph, int b_Month, int b_Day, int b_Year){
        this.name = name;
        this.ph = ph;
        this.b_Month = b_Month;
        this.b_Day = b_Day;
        this.b_Year = b_Year;
    }

    public String getName() {
        return name;
    }

    public String getPh() {
        return ph;
    }

    public int getB_Month() {
        return b_Month;
    }

    public int getB_Day() {
        return b_Day;
    }

    public int getB_Year() {
        return b_Year;
    }

    @Override
    public String toString() {
        return name;
    }
}
