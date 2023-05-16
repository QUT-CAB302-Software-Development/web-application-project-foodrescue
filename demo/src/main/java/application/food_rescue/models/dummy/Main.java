package application.food_rescue.models.dummy;

public class Main {
    public static void main(String[] args) {
        DummyReviewFetcher fetcher = new DummyReviewFetcher();
        DummyReview review = fetcher.fetchDummyReview(63);
        System.out.println(review);

//        DummyReviewFetcher fetcher = new DummyReviewFetcher();
//        DummyReview[] reviews = fetcher.fetchDummyReviews();
//        for (DummyReview review : reviews) {
//            System.out.println(reviews);
//        }
//    }
    }
}
