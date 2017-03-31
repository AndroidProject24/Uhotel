package com.acuteksolutions.uhotel.mvp.model.data;

import java.util.List;

public class Detail {
    private String title;
    private String actors;
    private String director;
    private int duration;
    private String poster;
    private String description;
    private List<String> genres;

    public Detail(String title, String actors, String director, int duration, String poster, String description, List<String> genres) {
        this.title = title;
        this.actors = actors;
        this.director = director;
        this.duration = duration;
        this.poster = poster;
        this.description = description;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public String getActors() {
        return actors;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public String getPoster() {
        return poster;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getGenres() {
        return genres;
    }
}