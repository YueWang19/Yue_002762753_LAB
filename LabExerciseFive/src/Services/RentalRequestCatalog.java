/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Library.Librarian;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class RentalRequestCatalog {
    
    ArrayList<RentalRequest> requestlist;
    
    
    public RentalRequestCatalog(){
        this.requestlist = new ArrayList<>();
        
    }

    public ArrayList<RentalRequest> getRequestlist() {
        return requestlist;
    }

    public void setRequestlist(ArrayList<RentalRequest> requestlist) {
        this.requestlist = requestlist;
    }
//    
//     public RentalRequest createRentalRequest(Customer customer, Librarian librarian) {
//        RentalRequest r = new RentalRequest(customer, librarian);
//        this.requestlist.add(r);
//        return r;
//    }
//    
//    public RentalRequest requestRentalRequest(Customer customer) {
//        RentalRequest r = new RentalRequest();
//        r.setCustomer(customer);
//        
//        this.requestlist.add(r);
//        
//        return r;
//    }
    
    public RentalRequest assignRentalRequest(RentalRequest r, Librarian librarian) {
        r.setLibrarian(librarian);
        return r;
    }
}
