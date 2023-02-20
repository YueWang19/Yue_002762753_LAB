/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Book.Book;
import Customer.Customer;
import Library.Librarian;

/**
 *
 * @author Yue
 */
public class RentalRequest {
    
    Customer customer;
    Librarian librarian;
    Book book;
    private static int count = 0;
    String requestId;
    double price;
    String status;
    String durationFields;
    
//    public RentalRequest() {
//        this.customer = new Customer();
//        this.librarian = new Librarian();
//        this.status = "Created";
//        this.count++;
//        
//        this.requestId = "REQUEST"+this.count;
//        this.price = 0;
//        this.durationFields = "";
//        
//    }
    
    public RentalRequest(Customer customer, Book book, double price, String durationFields) {
        this.customer = customer;
        this.book = book;
        this.status = "Created";
        this.count++;
        
        this.requestId = "REQUEST"+this.count;
        this.price = price;
        this.durationFields = durationFields;
        
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RentalRequest.count = count;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDurationFields() {
        return durationFields;
    }

    public void setDurationFields(String durationFields) {
        this.durationFields = durationFields;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    
    
    @Override
    public String toString() {
       return this.requestId;
    }
    
}
