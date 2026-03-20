package com.itshaala;


import com.itshaala.configuration.SpringConfiguration;
import com.itshaala.controller.MovieController;
import com.itshaala.model.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Dhurandar");
        movie.setDirector("Bhushan");
        movie.setYear(2026);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MovieController movieController = context.getBean(MovieController.class);

        movieController.add(movie);
    }
}
