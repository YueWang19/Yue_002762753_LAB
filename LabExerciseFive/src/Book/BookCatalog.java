/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class BookCatalog {
    
    ArrayList<Book> bookList;
    
    public BookCatalog(){
        this.bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public Book createBook(String name, String author, String genre ) {
        Book book = new Book(name, author,genre);
        this.bookList.add(book);
        return book;
    }
    
   public Book findBookByName(String name){
       for(Book book: this.bookList){
           if(book.getName().equals(name)){
               return book;
           }
       }
       return null;
   }
}
