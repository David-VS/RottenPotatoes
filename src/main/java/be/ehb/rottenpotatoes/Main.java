package be.ehb.rottenpotatoes;

import be.ehb.rottenpotatoes.api.FilmApi;
import be.ehb.rottenpotatoes.model.Film;
import be.ehb.rottenpotatoes.model.Review;

public class Main {

    public static void main(String[] args) {
        Film theDeparted = new Film("The departed", 1999, "Thriller");
        Film fastAndFurious = new Film("2 fast 2 furious tokyo drift", 2005, "Action");

        Review first = new Review("Jonah De la Vega", "Not enough water", 8);

        FilmApi myFilmApi = new FilmApi();
        myFilmApi.addFilm(theDeparted);
        myFilmApi.addFilm(fastAndFurious);
        myFilmApi.addReview(fastAndFurious, first);

        first.setScore(7);
        myFilmApi.editReview(fastAndFurious, first);

        System.out.println(myFilmApi.getFilmCollection());
    }
}
