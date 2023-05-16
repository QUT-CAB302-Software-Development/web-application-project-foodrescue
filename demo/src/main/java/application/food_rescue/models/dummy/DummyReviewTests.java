package application.food_rescue.models.dummy;

import application.food_rescue.models.FoodListing;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DummyReviewTests {
    DummyReviewFetcher fetcher = new DummyReviewFetcher();
    @Test
    public void testIDFetched(){

        DummyReview review = fetcher.fetchDummyReview(1);
        assertEquals(1, review.getId());
    }

    @Test
    public void testBodyFetched(){

        DummyReview review = fetcher.fetchDummyReview(1);
        assertEquals("This is some awesome thinking!", review.getReview_description());
    }
}
