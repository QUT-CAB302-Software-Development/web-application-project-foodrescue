package application.food_rescue.models.dummy;
import com.google.gson.Gson;

public class DummyReviews {
    private DummyReview[] reviews;

    public DummyReview[] getDummyReviews() {
        return reviews;
    }

    public static DummyReviews fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyReviews.class);
    }
}

