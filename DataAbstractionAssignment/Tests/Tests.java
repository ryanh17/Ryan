import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Tests {
    Customer guest;
    @Before
    public void setup(){
        guest = new Customer("Guest", 1, 100, 200);
    }
    @Test
    public void testDepositString(){
        //create new deposit
        Deposit d = new Deposit(200, "Checking");
        //new date
        Date date = new Date();
        //check if deposit object is equal to expected
        assertEquals(d.toString(), "Deposit of: $200.0 Date: " + date + " into account: Checking");
    }
    @Test
    public void testWithdrawString(){
        //create new withdraw
        Withdraw w = new Withdraw(100, "Checking");
        //new date
        Date date = new Date();
        //check if withdraw object is equal to expected
        assertEquals(w.toString(), "Withdraw of: $100.0 Date: " + date + " from account: Checking");
    }
    @Test
    public void testCustomerDeposit(){
        //check if check balance and saving balance are actually what was setup
        assertEquals(guest.getCheckBalance(), 100.0);
        assertEquals(guest.getSavingBalance(), 200.0);
        //deposit $500 to guest checking account
        guest.deposit(500, Customer.CHECKING);
        //check if balance increased
        assertEquals(guest.getCheckBalance(), 600.0);
        //deposit #300 to savings
        guest.deposit(300, Customer.SAVING);
        //check if balance is increased
        assertEquals(guest.getSavingBalance(), 500.0);
    }
    @Test
    public void testCustomerWithdraw(){
        //check if check & saving balance actually what was setup
        assertEquals(guest.getCheckBalance(), 100.0);
        assertEquals(guest.getSavingBalance(), 200.0);
        //withdraw $50 from checking and $150 from savings
        guest.withdraw(50, Customer.CHECKING);
        guest.withdraw(150, Customer.SAVING);
        //check if check and saving balance actually changed
        assertEquals(guest.getCheckBalance(), 50.0);
        assertEquals(guest.getSavingBalance(), 50.0);
    }
}
