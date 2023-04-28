package be.ehb.rottenpotatoes.api;

import be.ehb.rottenpotatoes.crud.FilmCRUD;
import be.ehb.rottenpotatoes.model.Film;

import java.util.HashSet;

//design by contract
public class FilmApi implements FilmCRUD {

    private HashSet<Film> filmCollection = new HashSet<>();

    public FilmApi() {
    }

    public HashSet<Film> getFilmCollection() {
        return filmCollection;
    }

    @Override
    public void addFilm(Film film) {
        this.filmCollection.add(film);
    }

    @Override
    public void removeFilm(Film film) {
        this.filmCollection.remove(film);
    }

    @Override
    public HashSet<Film> showAllFilms() {
        return this.filmCollection;
    }
}
