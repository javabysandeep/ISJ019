package com.itshaala.service;

import com.itshaala.dao.MovieDao;
import com.itshaala.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public void add(Movie movie) {
        movieDao.add(movie);
    }
}
