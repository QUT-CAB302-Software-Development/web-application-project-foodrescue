package application.food_rescue.models;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String review_title;
    @Column(nullable = false)
    private String review_description;
    @Column(nullable = false)
    private int rating;


    public Review(String review_title, String description, int rating) {
        this.review_title = review_title;
        this.review_description = description;
        this.rating = rating;
    }

    public Review() {}

    public String getReview_title() {
        return review_title;
    }

    public void setReview_title(String review_title) {
        this.review_title = review_title;
    }

    public String getReview_description() {
        return review_description;
    }

    public void setReview_description(String review_description) {
        this.review_description = review_description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
