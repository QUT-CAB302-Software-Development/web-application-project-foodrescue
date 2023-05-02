package application.food_rescue.models;

import application.food_rescue.exceptions.InvalidReviewException;

public class Review {


    private String title;

    private String description;

    private int rating;



    private long userId;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }



    /**
     * Method 5
     * Review constructor that creates a review only when ratings are valid and the review description
     * in not null
     */
    public Review(String title, String description, int rating) throws InvalidReviewException {
        if (title == null || description
                == null) {
            throw new InvalidReviewException("Title and description cannot be null");
        }
        if (rating < 1 || rating > 5) {
            throw new InvalidReviewException("Invalid rating");
        }
        this.title = title;
        this.description = description;
        this.rating = rating;
    }




}