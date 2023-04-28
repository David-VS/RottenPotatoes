package be.ehb.rottenpotatoes;

import be.ehb.rottenpotatoes.api.FilmApi;
import be.ehb.rottenpotatoes.model.Film;

public class Main {

    public static void main(String[] args) {
        Film theDeparted = new Film("The departed", 1999, "Thriller");
        Film fastAndFurious = new Film("2 fast 2 furious tokyo drift", 2005, "Action");

        FilmApi myFilmApi = new FilmApi();
        myFilmApi.addFilm(theDeparted);
        myFilmApi.addFilm(fastAndFurious);

        System.out.println(myFilmApi.getFilmCollection());
    }
}
