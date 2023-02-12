/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import UI.CustomerWorkArea.CustomerJFrame;
import UI.DeliverAgentWorkArea.AgentJFrame;
import UI.ManagerWorkArea.ManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author Yue
 */
public class UserAccount {
    
    private static int count = 0;// a static variable for a counter, initialize once will share all objects
    private String accountId;
    private String username;
    private String password;
    
    //assume roles are defined as manager,delivery agent, customer
    private String role;
    
    public UserAccount(){// default constructor
        this.accountId = "ACC" + count++;// every time it will increase 
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public UserAccount (String username, String password,String role){// parameter constructor
        this.accountId = role + count++;// use role, when user create it will pass to it dynamic,such as customer1,customer2 or agent1 , agent2
        this.username = username;
        this.password = password;
        this.role = role;
        
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public JFrame getWorkArea(String role, Business business, UserAccount useraccount){
        if(role.equals("manger")){
            return new ManagerJFrame(business,useraccount);
        }
        
        if (role.equals("customer")){
            return new CustomerJFrame(business,useraccount);
        }
        
        if(role.equals("agent")){
            return new AgentJFrame(business,useraccount);
        }
        return null;
    }
    
    
}
