/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Yue
 */
public class Observation {
    int observationId;
    private  double bloodPressure;
    private double temperature;
    private Medicine medication;
    public Observation (){
        this.medication = new Medicine();
        
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Medicine getMedication() {
        return medication;
    }

    public void setMedication(Medicine medication) {
        this.medication = medication;
    }
    
    
    //attach a medicine
   
            
            
    
    // after change the ID type in table to Object 
    // this method will change the ID object as a String 
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
    
}
