/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class VitalSignHistory {
    //hava arraylist to store vital signs
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
        
    
}

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    // fetch or find an observation based on ID
    public Observation findObservation(int id){
        for (Observation o : this.vitalSignHistory){
            if(o.getObservationId() == id){
                return o;
            }
        }
        return null;
    }
    
    public Observation createObservation(int observationId, double bloodPressure, double temperature){
        Observation observation = new Observation();
        
   
        observation.setObservationId(observationId);
        observation.setTemperature(temperature);
        observation.setBloodPressure(bloodPressure);
        //add the observation object into the arraylist
        this.vitalSignHistory.add(observation);
        
        return observation;
    }
    
    //or create seperately here to check the ID is unique 
    public Boolean checkObservationIDUnique(int id){
        
        for( Observation o : this.vitalSignHistory){
            if(o.getObservationId() == id){
                return false;
            }
        }
        return true;
    }
    
}
