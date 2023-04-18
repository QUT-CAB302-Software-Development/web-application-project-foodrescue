package example.data;

import example.data.Exceptions.InvalidReviewException;
import java.util.List;
import java.util.ArrayList;

public class BusinessPage {
    private String name;
    private List<Review> reviews;

    public BusinessPage(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public int getNumberOfReviews() {
        return reviews.size();
    }

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

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) throws InvalidReviewException {
        if (review == null) {
            throw new InvalidReviewException("Review cannot be null");
        }
        if (review.getRating() < 1 || review.getRating() > 5) {
            throw new InvalidReviewException("Invalid rating");
        }
        reviews.add(review);
    }
}
