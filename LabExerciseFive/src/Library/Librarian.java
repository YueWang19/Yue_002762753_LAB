/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Personnel.Person;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class Librarian extends Person{
    
    private int rentalRequestCount;
    
    ArrayList<RentalRequest> librarianRequestList;
    
    public Librarian(){
        super();
        this.librarianRequestList = new  ArrayList<>();
    }

    public int getRentalRequestCount() {
        return rentalRequestCount;
    }

    public void setRentalRequestCount(int rentalRequestCount) {
        this.rentalRequestCount = rentalRequestCount;
    }

    public ArrayList<RentalRequest> getLibrarianRequestList() {
        return librarianRequestList;
    }

    public void setLibrarianRequestList(ArrayList<RentalRequest> librarianRequestList) {
        this.librarianRequestList = librarianRequestList;
    }
    
    public void addRequest(RentalRequest request){
        this.librarianRequestList.add(request);
    }
    
    
    
}
