/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliverAgent;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class MasterOrderDirectory {
    ArrayList<Order> orderlist;
    
    public MasterOrderDirectory(){
        this.orderlist = new ArrayList<Order>();
        
    }
    
        
    public Order createOrder(Customer customer, DeliverAgent agent){
        Order o = new Order(customer, agent);
        this.orderlist.add(o);
        return o;
        
    }
    
    public Order requestOrder(Customer customer){
        Order o = new Order();
        o.setCustomer(customer);
        
        this.orderlist.add(o);
        return o;
        
    }
    
    public Order assignOrder(Order o, DeliverAgent del){
        o.setAgent(del);
        return o;
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
    
    
}
