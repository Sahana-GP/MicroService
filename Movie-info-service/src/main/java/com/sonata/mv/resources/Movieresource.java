package com.sonata.mv.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.mv.models.Movie;

@RestController
@RequestMapping("/movies")
public class Movieresource {

	
	@RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Avengers", "Avengers EndGame");
    }
}
