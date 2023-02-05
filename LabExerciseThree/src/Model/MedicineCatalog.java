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
public class MedicineCatalog {
    
    ArrayList<Medicine> medicineCatalog;
    
    public MedicineCatalog(){
        this.medicineCatalog = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineCatalog() {
        return medicineCatalog;
    }

    public void setMedicineCatalog(ArrayList<Medicine> medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        medicine.setDosage(dosage);
        medicine.setMedicineName(name);
        
        this.medicineCatalog.add(medicine);
        
        return medicine;
    }
    
    // check if medicine already exists
    public Boolean checkIfMedicineUnque(String name){
        for (Medicine med: this.medicineCatalog){
            if(med.getMedicineName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    //delete a medicine from the catalog
    public void removeMedicine(String name) {

        //find the medicine object in the arraylist by this name
        for (Medicine med : this.medicineCatalog) {
            if (med.getMedicineName().equals(name)) {
                this.medicineCatalog.remove(med);
                break;

            }

        }
    }
}
