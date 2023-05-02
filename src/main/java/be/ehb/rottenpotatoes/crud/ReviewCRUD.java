package be.ehb.rottenpotatoes.crud;

import be.ehb.rottenpotatoes.model.Film;
import be.ehb.rottenpotatoes.model.Review;

//TODO addReview en editReview
public interface ReviewCRUD {

    void addReview(Film f, Review r);
    void editReview(Film f, Review r);
}
