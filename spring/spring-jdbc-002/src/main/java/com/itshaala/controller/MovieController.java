package com.itshaala.controller;

import com.itshaala.model.Movie;
import com.itshaala.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    public void add(Movie movie) {
        movieService.add(movie);
    }
}
