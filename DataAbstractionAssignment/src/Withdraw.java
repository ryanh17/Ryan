import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date = new Date();
    private String account;

    Withdraw(double amount, String account){
        this.amount = amount;
        this.account = account;
    }

    public String toString(){
        return "Withdraw of: $" + amount + " Date: " + date + " from account: " + account;
    }
}
