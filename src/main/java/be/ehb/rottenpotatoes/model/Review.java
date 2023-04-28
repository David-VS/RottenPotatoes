package be.ehb.rottenpotatoes.model;

public class Review {

    private String authorName;
    private String reviewText;
    private int score;

    public Review() {
    }

    public Review(String authorName, String reviewText, int score) {
        this.authorName = authorName;
        this.reviewText = reviewText;
        this.score = score;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
