package com.sonata.mv.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sonata.mv.models.Movie;
import com.sonata.mv.models.MovieSummary;
@RestController
@RequestMapping("/movies")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId")String movieId) {
        return new Movie(movieId , "Test", "name");
        
    }
}