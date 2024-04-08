package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {System.out.println("what ist the title for movie?");
        String title;
        Scanner sc=new Scanner(System.in);
        title=sc.nextLine();
        Movie movie=new Movie();
        movie.setTitle(title);
        MovieService movieService=new MovieService();
        movieService.registerMovie(movie);
    }
}
