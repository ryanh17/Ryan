import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    private Random ran = new Random();

    Customer(){
        //create default constructor
        accountNumber = ran.nextInt(100);
        name = String.valueOf(accountNumber);
        deposit(1000, CHECKING);
        checkBalance += 1000;
        deposit(500, SAVING);

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
        if (account.equals(CHECKING)){
            checkBalance += amt;
        } else{
            savingBalance += amt;
        }
        return 0;
    }
    public double withdraw(double amt, String account){
        //your code here
        if (!(checkOverdraft(amt, account))){
            Withdraw w = new Withdraw(amt, account);
            withdraws.add(w);
        }
        return 0;
    }

    private boolean checkOverdraft(double amt, String account){
        //your code here
        if (account.equals(CHECKING)){
            if (amt > checkBalance){
                return true;
            }
        }else{
            if (amt > savingBalance){
                return true;
            }
        }
        return false;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
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
