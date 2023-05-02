package application.food_rescue.models;


import application.food_rescue.exceptions.InvalidReviewException;
import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

/* BusinessPage Class
* parameters: String name
* attributes: int id, String name, List<Review> reviews
*
* Methods:
* 1. getNumberOfReviews(): returns the size of reviews
* 2. getAverageRating(): returns the average rating from reviews, returns 0 if it is empty
* 3. deleteReview(Review review): removes review from reviews if it exists in reviews
* 4. addReview(Review review): adds review to reviews if it has a valid rating and is not null
* 5. getName(): returns name
* 6. getReviews(): returns reviews
* */

@Entity
public class BusinessPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    private List<Review> reviews;

    public BusinessPage(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    /** Method 1
     * Returns: Total number of reviews on a Business account
     */
    public int getNumberOfReviews() {
        return reviews.size();
    }
    /** Method 2
     * Returns: Calculates an average of all the ratings on the page
     */
    public double getAverageRating() {
        if (reviews.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        return (double) sum / reviews.size();
    }

    /**
     * Method 3
     * Deletes a review if review exists on the page
     * Returns: void
     *
     * @return
     */
    public void deleteReview(Review review) throws InvalidReviewException {
        if(!reviews.contains(review)){
            throw new InvalidReviewException("Review can't be deleted as it doesn't exist on the page");
        }
        reviews.remove(review);
    }

    /** Method 4
     * Adds a review to a page making sure it has appropriate rating and is not null
     * Returns: void
     */
    public void addReview(Review review) throws InvalidReviewException {
        if (review == null) {
            throw new InvalidReviewException("Review cannot be null");
        }
        if (review.getRating() < 1 || review.getRating() > 5) {
            throw new InvalidReviewException("Invalid rating");
        }
        reviews.add(review);
    }

    public String getName() {
        return name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

}
