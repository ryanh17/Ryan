public class Main {
    static double temp;
    public static void main(String[] args) {
//        System.out.println(linearEquation(2, 4, 10));
//        System.out.println(cubeRoot(5));
//        System.out.println(quadraticEq(1, 3, -10, 0));
//        System.out.println(quadraticEq(1, 4, 4,0));
        System.out.println(quadraticEq(1, -20, 4,0));

    }

    //Requires: double, double, double
    //Modifies: this
    //Effects: calculate linear equation to find x & return
    public static String linearEquation(double a, double b, double c){
        double ans;
        ans = c - b;
        ans = ans/a;
        return "x = " + Double.toString(ans);
    }

    //Requires:
    //Modifies:
    //Effects:
    public static String quadraticEq(double a, double b, double c, double constant){
        //ax^2 + bx + c = constant
        System.out.println(b);
        if(Math.pow(b, 2) - (4*a*c) > 0){
            System.out.println("hello0");
            double ans = -b + (Math.sqrt(Math.pow(b, 2) - (4*a*c)));
            ans /= (2*a);
            double ans1 = -b - (Math.sqrt(Math.pow(b, 2) - (4*a*c)));
            ans1 /= (2*a);
            return ans + "\n" + ans1;
        }else if(Math.pow(b, 2) - (4*a*c) == 0){
            System.out.println("hello1");
            double ans = -b + (Math.sqrt(Math.pow(b, 2) - (4*a*c)));
            ans /= (2*a);
            return Double.toString(ans);
        }else if (Math.pow(b, 2) - (4*a*c) < 0){
            System.out.println("hello2");
            return "no real solution";
        }
        return "";
    }

    //Requires: int
    //Modifies: this
    //Effects: cuberoot of num and return
    public static double cubeRoot(int num){
        temp = java.lang.Math.cbrt(num);
        return Double.parseDouble(String.format("%.3g%n", temp));
    }
}
