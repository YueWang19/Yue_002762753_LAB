/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class Customer extends Person {// inheritance from Person class
    private int ordersTotal;
    
    private ArrayList<Order> customerOrderlist;
    
    public Customer(){
        super();// when use super can call Person class
        this.customerOrderlist = new ArrayList<Order>();
        
        
    }
    
    public void addOrder(Order o){
        this.customerOrderlist.add(o);
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public ArrayList<Order> getCustomerOrderlist() {
        return customerOrderlist;
    }

    public void setCustomerOrderlist(ArrayList<Order> customerOrderlist) {
        this.customerOrderlist = customerOrderlist;
    }
    
    
}
