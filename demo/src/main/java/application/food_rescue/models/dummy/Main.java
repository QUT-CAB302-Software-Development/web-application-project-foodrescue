package application.food_rescue.models.dummy;

public class Main {
    public static void main(String[] args){
        DummyReviewFetcher fetcher = new DummyReviewFetcher();
        DummyReview review = fetcher.fetchDummyReview(1);
        System.out.println(review);
    }
}
