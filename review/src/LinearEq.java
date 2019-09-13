public class LinearEq {
    public static double ans = 0;




    //Requires: double, double, double
    //Modifies: this
    //Effects: calculate linear equation to find x & return
    public static String linearEquation(double a, double b, double c){
        ans = c - b;
        ans = ans/a;
        return "x = " + Double.toString(ans);
    }
}
