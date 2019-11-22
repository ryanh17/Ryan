package tools;

import model.Items;
import tools.time.Time;

import java.util.ArrayList;

public class Order {
    ArrayList<Items> customerOrder;
    Time start;
    Time end;
    boolean out;
    boolean complete;


    //Requires: ArrayList, Time, Kitchen
    //Modifies: this
    //Effects: adds items from items ArrayList to customerOrder ArrayList
    //          sets start time
    //          default: end time is 20 seconds more than start time
    //          if inventory doesn't have customer order item then add 10 mins (600 seconds)
    Order(ArrayList<Items> items, Time start, Kitchen kitchen){
        //if not in inventory add 10 minutes to order
        customerOrder = items;
        this.start = start;
        end = new Time(start);
        for(int i = 0; i < 20;i++){
            end.tick();
        }
        for (int i = 0; i<customerOrder.size();i++){
            if (!(kitchen.getInventory().contains(customerOrder.get(i)))) {
                for (int x = 0; x < 600; x++) {
                    end.tick();
                }
            }
        }
        out = false;
        complete = false;
    }

    public void deliveryInProgross(){
        out = true;
    }
    public void delivered(){
        complete = true;
    }
    public double getTotalPrice(){
        return 0;
    }
}
