/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Author;

import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class AuthorDirectory {
    
    ArrayList<Author> authorList;
    
    public AuthorDirectory (){
        this.authorList = new ArrayList<>();
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }
    
    public Author createAuthor(String name){
        Author author = new Author(name);
        this.authorList.add(author);
        return author;
    }
}
