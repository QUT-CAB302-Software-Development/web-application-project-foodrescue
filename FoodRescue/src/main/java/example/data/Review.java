package example.data;

import example.data.Exceptions.InvalidReviewException;

public class Review {


    private String title;

    private String description;

    private int rating;

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


}