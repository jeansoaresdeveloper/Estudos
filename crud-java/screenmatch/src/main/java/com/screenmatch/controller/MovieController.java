package com.screenmatch.controller;

import com.screenmatch.domain.DataAlterMovie;
import com.screenmatch.domain.DataMovie;
import com.screenmatch.domain.Movie;
import com.screenmatch.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @Autowired(required = true)
    private MovieRepository movieRepository;

    @GetMapping("/form")
    public String loadingPageForm(Long idMovie, Model model) {
        if (idMovie != null) {
            Movie movie = this.movieRepository.getReferenceById(idMovie);
            model.addAttribute("movie", movie);
        }
        return "movies/form";
    }

    @GetMapping
    public String loadingPageListing(Model model) {
        model.addAttribute("listMovie", this.movieRepository.findAll());
        return "movies/listing";
    }

    @DeleteMapping
    @Transactional
    public String removeMovie(Long idMovie) {
        this.movieRepository.deleteById(idMovie);
        return "redirect:/movies";
    }

    @PutMapping
    @Transactional
    public String updateMovie(DataAlterMovie dataMovie) {
        Movie movie = this.movieRepository.getReferenceById(dataMovie.getId());
        movie.updateData(dataMovie);

        return "redirect:/movies";
    }

    @PostMapping
    @Transactional
    public String registerMovie(DataMovie dataMovie,Model model) {
        Movie movie = new Movie(dataMovie);
        this.movieRepository.save(movie);
        return "redirect:/movies";
    }
}