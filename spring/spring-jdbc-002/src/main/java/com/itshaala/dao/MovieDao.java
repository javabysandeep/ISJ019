package com.itshaala.dao;

import com.itshaala.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void add(Movie movie) {
        String query = "insert into movie(title, director, year) values(?,?,?)";
        jdbcTemplate.update(query, movie.getTitle(), movie.getDirector(), movie.getYear());
        System.out.println("Added movie: " + movie.getTitle() + " " + movie.getDirector() + " " + movie.getYear());
    }
}
