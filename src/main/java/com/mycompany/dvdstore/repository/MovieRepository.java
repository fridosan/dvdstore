package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;

public class MovieRepository {
    ArrayList movies=new ArrayList();
    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+ movie.getTitle()+" has been added");
    }
}
