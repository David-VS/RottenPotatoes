package be.ehb.rottenpotatoes.crud;

//TODO addFilm, removeFilm en showAllFilms.

import be.ehb.rottenpotatoes.model.Film;

import java.util.HashSet;

public interface FilmCRUD {

    void addFilm(Film film);
    void removeFilm(Film film);
    HashSet<Film> showAllFilms();
}
