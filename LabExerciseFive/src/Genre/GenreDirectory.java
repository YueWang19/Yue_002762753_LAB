/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genre;

import Author.Author;
import java.util.ArrayList;

/**
 *
 * @author Yue
 */
public class GenreDirectory {
    ArrayList<Genre> genreList;
    
    public GenreDirectory (){
        this.genreList = new ArrayList<>();
    }

    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }


    
    public Genre createGenre(String name){
        Genre genre = new Genre(name);
        this.genreList.add(genre);
        return genre;
    }
    
    
    
}
