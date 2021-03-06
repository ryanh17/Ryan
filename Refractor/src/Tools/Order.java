package tools;

import model.Items;
import tools.time.Time;

import java.util.ArrayList;

public class Order {
    ArrayList<Items> customerOrder;
    Time start;
    Time end;
    private Customer customer;
    boolean deliveryInProgress;
    boolean delivered;
    double orderCost;


    //Requires: ArrayList, Time, Kitchen
    //Modifies: this
    //Effects: adds items from items ArrayList to customerOrder ArrayList
    //          sets start time
    //          default: end time is 20 seconds more than start time
    //          if inventory doesn't have customer order item then add 10 mins (300 ticks )
    public Order(ArrayList<Items> items, Time start, Kitchen kitchen, Customer customer){
        //if not in inventory add 10 minutes to order
        this.customer = customer;
        customerOrder = items;
        this.start = start;
        end = new Time(start);
        for(int t = 0; t < 20;t++){
            end.tick();
        }

        for (int i = 0; i<customerOrder.size();i++){
            if (!(kitchen.getInventory().contains(customerOrder.get(i))) == false) {
                for (int x = 0; x < 300; x++) {
                    end.tick();
                }

            }
        }
        deliveryInProgress = true;
        delivered = false;
    }

    public boolean isDeliveryInProgress() {
        return deliveryInProgress;
    }

    //Requires:
    //Modifies: this
    //Effects: sets delivered to true
    public void delivered(){
        delivered = true;
    }

    //Requires:
    //Modifies: this
    //Effects: adds price of each item in customer order to the total (orderCost)
    public double getTotalPrice(){
        for(Items i: customerOrder){
            orderCost += i.getPrice();
        }

        return orderCost;
    }

    public Time getEndTime(){
        return end;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Items> getCustomerOrder() {
        return customerOrder;
    }
}

