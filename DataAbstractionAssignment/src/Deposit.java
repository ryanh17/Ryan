import java.util.Date;

public class Deposit {
    private double amount;
    private Date date = new Date();
    private String account;

    Deposit(double amount, String account){
        this.amount = amount;
        this.account = account;
    }

    public String toString(){
        //your code here
        return "Deposit of: $" + amount + " Date: " + date + " into account: " + account;
    }
}
