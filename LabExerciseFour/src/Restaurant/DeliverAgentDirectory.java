/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class DeliverAgentDirectory  {
    
    ArrayList<DeliverAgent> agentlist;
    
    public DeliverAgentDirectory(){
        this.agentlist = new ArrayList<DeliverAgent>();
        
    }

    public ArrayList<DeliverAgent> getAgentlist() {
        return agentlist;
    }

    public void setAgentlist(ArrayList<DeliverAgent> agentlist) {
        this.agentlist = agentlist;
    }
    
    
    public DeliverAgent findById(String id) {
        for (DeliverAgent agent : this.agentlist) {
            if (agent.getPersonID().equals(id)) {
                return agent;
            }
        }
        return null;
    }

    public DeliverAgent createAgent(String id, String name, String age) {
        DeliverAgent d = new DeliverAgent();
        d.setPersonID(id);
        d.setName(name);
        d.setAge(age);

        this.agentlist.add(d);

        return d;
    }
         
 
        
        
  
    
    
}
