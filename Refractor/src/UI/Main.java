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
        ArrayList<Items> combo1 = new ArrayList<>();
        combo1.add(new Pizza("Pizza", 20, true));
        combo1.add(new Pasta("Pasta", 15, false));

        Kitchen main = new Kitchen("Kitchen", new Customer("Chris", "721 Oak St."));
        Time time = new Time();
        main.startStuff();

        System.out.println(main.getInventory());
        Order order = new Order(combo1, time, main);
        System.out.println(order.getTotalPrice());
        System.out.println(order.getEndTime());
        System.out.println(main.getCustomers());

        Order order1 = new Order(combo1, time, main);
        System.out.println(order1.getEndTime());

    }
}
