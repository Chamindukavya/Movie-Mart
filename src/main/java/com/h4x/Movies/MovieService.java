package com.h4x.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MoviesRepository moviesRepository;
    public List<Movie> allMovies(){
        return moviesRepository.findAll();
    }

    public Optional<Movie> singleMovie(String ImdbID){  //optional<> meken karnne id ekata match wena ekk naththn null return karana eka
        return moviesRepository.findMovieByImdbId(ImdbID);
    }
}
