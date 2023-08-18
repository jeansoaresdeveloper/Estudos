package com.screenmatch.domain;

public class DataAlterMovie {
    private Long id;
    private String name;
    private int duration;
    private int yearRelease;
    private String movieGenre;

    public DataAlterMovie(Long id, String name, int duration, int yearRelease, String movieGenre) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.yearRelease = yearRelease;
        this.movieGenre = movieGenre;
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
}
