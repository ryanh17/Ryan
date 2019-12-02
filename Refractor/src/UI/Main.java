package ui;

import model.Items;
import model.Pasta;
import model.Pizza;
import tools.Customer;
import tools.Kitchen;
import tools.Order;
import tools.time.Time;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //setup time
        Time time = new Time();

        //setting up combo 1
        ArrayList<Items> combo1 = new ArrayList<>();
        combo1.add(new Pizza("Pizza", 20, true));
        combo1.add(new Pasta("Pasta", 15, false));

        //setup kitchen and start making stuff in kitchen
        Kitchen main = new Kitchen("Main Kitchen");
        main.startStuff();

        //get kitchen inventory
        System.out.println(main.getInventory());

        //new order for chris, get his info, get total price, get end time of order, get his order, check if order is being delivered
        // and set his order as delivered
        Order order = new Order(combo1, time, main, new Customer("Chris", "721 Oak St"));
        System.out.println(order.getCustomer());
        System.out.println(order.getTotalPrice());
        System.out.println(order.getEndTime());
        System.out.println(order.getCustomerOrder());
        System.out.println(order.isDeliveryInProgress());
        order.delivered();

    }
}
