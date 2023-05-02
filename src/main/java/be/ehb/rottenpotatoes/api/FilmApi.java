package be.ehb.rottenpotatoes.api;

import be.ehb.rottenpotatoes.crud.FilmCRUD;
import be.ehb.rottenpotatoes.crud.ReviewCRUD;
import be.ehb.rottenpotatoes.model.Film;
import be.ehb.rottenpotatoes.model.Review;

import java.util.HashSet;

//design by contract
public class FilmApi implements FilmCRUD, ReviewCRUD {

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

    @Override
    public void addReview(Film f, Review r) {
        for (Film search:this.filmCollection) {
            if(search.equals(f)){
                f.addReview(r);
            }
        }
    }

    @Override
    public void editReview(Film f, Review r) {
        for (Film searchF:this.filmCollection) {
            if(searchF.equals(f)){
                for (Review searchR: searchF.getReviewSet()){
                    if(searchR.getAuthorName().equals(r.getAuthorName())){
                        searchR = r;
                    }
                }
            }
        }
    }
}
