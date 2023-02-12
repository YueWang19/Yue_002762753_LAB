/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliverAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author Yue
 */
public class Business {
    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliverAgentDirectory deliveragentDirectory;
    private MasterOrderDirectory allOrders;
    
    public Business(){
        
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveragentDirectory = new DeliverAgentDirectory();
        this.allOrders = new MasterOrderDirectory();
        //create a restaurant manger here
        UserAccount user = this.useraccountDirectory.createUserAccount("admin", "admin", "manger");
    }

    //a static method return a new Business object, also can be put in MainJFrame, but avoid put new in the UI
    public static Business getBusinessInstance(){
        return new Business();
    }
    
    
    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliverAgentDirectory getDeliveragentDirectory() {
        return deliveragentDirectory;
    }

    public void setDeliveragentDirectory(DeliverAgentDirectory deliveragentDirectory) {
        this.deliveragentDirectory = deliveragentDirectory;
    }

    public MasterOrderDirectory getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(MasterOrderDirectory allOrders) {
        this.allOrders = allOrders;
    }


    
    
    
}
