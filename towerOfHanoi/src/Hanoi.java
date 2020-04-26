public class Hanoi {
    public String Hanoi(int n, char from, char to, char spare){
        if (n == 1) {
            System.out.println("Plate 1 from " + from + " to " + to );
            return "Plate 1 from " + from + " to " + to;
        }else{
            Hanoi(n-1, from, spare, to);
            System.out.println("Plate " + n + " from " + from + " to " + to);
            Hanoi(n-1, spare, to, from);
        }
        return "";
    }
}
