import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(checkDeposit, CHECKING);
        deposit(savingDeposit, SAVING);
    }

    public double deposit(double amt, String account){
        //your code here
        Deposit d = new Deposit(amt, account);
        deposits.add(d);
        return 0;
    }
    public double withdraw(double amt, String account){
        //your code here
        Withdraw w = new Withdraw(amt, account);
        withdraws.add(w);
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if (account > )
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
