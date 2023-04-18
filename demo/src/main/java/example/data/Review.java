package example.data;

import example.data.Exceptions.InvalidReviewException;

public class Review {
    //    public Review(String s, String s1, int i) {
//    }
//
//    public int getRating() {
//    }
//}
    private String title;
    private String text;
    private int rating;

    public Review(String title, String text, int rating) throws InvalidReviewException {
        if (title == null || text == null) {
            throw new InvalidReviewException("Title and text cannot be null");
        }
        if (rating < 1 || rating > 5) {
            throw new InvalidReviewException("Invalid rating");
        }
        this.title = title;
        this.text = text;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getRating() {
        return rating;
    }

}