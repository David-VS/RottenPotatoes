package be.ehb.rottenpotatoes.model;

import java.util.HashSet;

public class Film {

    private String name;
    private int year;
    private String genre;
    private HashSet<Review> reviewSet = new HashSet<>();

    public Film() {
    }

    public Film(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public HashSet<Review> getReviewSet() {
        return reviewSet;
    }

    public void addReview(Review review){
        this.reviewSet.add(review);
    }

    @Override
    public String toString() {
        return this.name+", "+this.year+"\n";
    }
}
