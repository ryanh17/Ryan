public class Fibonacci {
    public int Fibonacci (int n){
        if (n <= 1){
            return n;
        }else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
