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
        Deposit d = new Deposit(200, "Checking");
        Date date = new Date();
        assertEquals(d.toString(), "Deposit of: $200.0 Date: " + date + " into account: Checking");
    }
    @Test
    public void testWithdrawString(){
        Withdraw w = new Withdraw(100, "Checking");
        Date date = new Date();
        assertEquals(w.toString(), "Withdraw of: $100.0 Date: " + date + " from account: Checking");
    }
    @Test
    public void testCustomerDeposit(){
        assertEquals(guest.getCheckBalance(), 100.0);
        assertEquals(guest.getSavingBalance(), 200.0);
        guest.deposit(500, Customer.CHECKING);
        assertEquals(guest.getCheckBalance(), 600.0);
        guest.deposit(300, Customer.SAVING);
        assertEquals(guest.getSavingBalance(), 500.0);
    }
}
