package com.screenmatch.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int duration;
    private int yearRelease;
    private String movieGenre;

    public Movie(DataMovie dataMovie) {
        this.name = dataMovie.getName();
        this.duration = dataMovie.getDuration();
        this.yearRelease = dataMovie.getYearRelease();
        this.movieGenre = dataMovie.getMovieGenre();
    }

    public Movie() {}

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", yearRelease=" + yearRelease +
                ", movieGenre='" + movieGenre + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void updateData(DataAlterMovie dataMovie) {
        this.name = dataMovie.getName();
        this.duration = dataMovie.getDuration();
        this.yearRelease = dataMovie.getYearRelease();
        this.movieGenre = dataMovie.getMovieGenre();
    }
}
