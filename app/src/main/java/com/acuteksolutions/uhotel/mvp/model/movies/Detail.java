package com.acuteksolutions.uhotel.mvp.model.movies;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Detail extends RealmObject {
    private String title;
    private String actors;
    private String director;
    private int duration;
    private String poster;
    private String description;
    private RealmList<Item> genres;

    public Detail() {
    }

    public Detail(String title, String actors, String director, int duration, String poster, String description, RealmList<Item> genres) {
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

    public RealmList<Item> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "title='" + title + '\'' +
                ", actors='" + actors + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", poster='" + poster + '\'' +
                ", description='" + description + '\'' +
                ", genres=" + genres +
                '}';
    }

}