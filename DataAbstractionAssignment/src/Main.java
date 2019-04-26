import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer ryan = new Customer("Ryan", 123, 300, 200);
        ryan.deposit(200, Customer.SAVING);
        ryan.displayDeposits();
        ryan.withdraw(401, Customer.SAVING);
        ryan.displayWithdraws();
    }
}