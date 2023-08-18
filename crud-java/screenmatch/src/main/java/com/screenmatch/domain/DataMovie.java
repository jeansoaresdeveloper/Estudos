package com.screenmatch.domain;

public class DataMovie {
    private String name;
    private int duration;
    private int yearRelease;
    private String movieGenre;

    public DataMovie(String name, int duration, int yearRelease, String movieGenre) {
        this.name = name;
        this.duration = duration;
        this.yearRelease = yearRelease;
        this.movieGenre = movieGenre;
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
