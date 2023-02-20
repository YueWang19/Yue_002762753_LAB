/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import Author.AuthorDirectory;
import Book.BookCatalog;
import Customer.CustomerDirectory;
import Genre.GenreDirectory;
import Library.Librarian;

/**
 *
 * @author Yue
 */
public class AppSystem {
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private AuthorDirectory authorDirectory;
    private Librarian librarian;
    private BookCatalog bookCatalog;
    private GenreDirectory genreDirectory;
    
    public AppSystem() {
        this.userAccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.librarian = new Librarian();
        this.bookCatalog = new BookCatalog();
        this.genreDirectory = new GenreDirectory();
        
//        this.allOrders = new MasterOrderDirectory();

        // create a system admin here
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "systemadmin");

    }
    
     public static AppSystem getAppSystemInstance() {
        
        return new AppSystem();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public BookCatalog getBookCatalog() {
        return bookCatalog;
    }

    public void setBookCatalog(BookCatalog bookCatalog) {
        this.bookCatalog = bookCatalog;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }
     
     
    public Librarian createLibrarian(String id, String name, String age) {
        Librarian l = new Librarian();
        l.setPersonID(id);
        l.setName(name);
        l.setAge(age);

//        this.agentList.add(d);
        return l;
    }
    
}
