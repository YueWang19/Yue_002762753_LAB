/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Book.Book;
import Library.Librarian;
import Personnel.Person;
import Services.RentalRequest;
import Services.RentalRequestCatalog;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class Customer extends Person{
    private int rentalRequestTotal;
    private RentalRequestCatalog customerRentalRequestList;
    private Librarian librarian;
    
    public Customer(){
        super();
        this.customerRentalRequestList = new RentalRequestCatalog();
        
        
    }

    public int getRentalRequestTotal() {
        return rentalRequestTotal;
    }

    public void setRentalRequestTotal(int rentalRequestTotal) {
        this.rentalRequestTotal = rentalRequestTotal;
    }

    public RentalRequestCatalog getCustomerRentalRequestList() {
        return customerRentalRequestList;
    }

    public void setCustomerRentalRequestList(RentalRequestCatalog customerRentalRequestList) {
        this.customerRentalRequestList = customerRentalRequestList;
    }

   
    
    public void addRequest(RentalRequest rentalRequest) {
        this.customerRentalRequestList.getRequestlist().add(rentalRequest);
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    
    
    public RentalRequest createRequest(Book book, double price, String durationFields){
        RentalRequest request = new RentalRequest( this,  book,  price,  durationFields);
////        request.setRequestId(requestId);
//        request.setPrice(price);
////        request.setStatus(status);
//        request.setDurationFields(durationFields);
        addRequest(request);
//        this.librarian.getLibrarianRequestList().add(request);
        return request;
        
    }
    
}
