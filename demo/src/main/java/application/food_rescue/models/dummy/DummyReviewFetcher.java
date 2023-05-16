package application.food_rescue.models.dummy;

import application.food_rescue.models.dummy.DummyReview;
import application.food_rescue.models.dummy.DummyReviews;

import java.net.URI;
import java.net.http.*;

public class DummyReviewFetcher {
    private HttpClient client = HttpClient.newHttpClient();

    /**
     * Fetches a user from the dummyJSON API.
     * GET: https://dummyjson.com/comments/{id}
     *
     * @param id the ID of the user to fetch
     * @return the DummyUser object
     */
    public DummyReview fetchDummyReview(int id) {
        String url = "https://dummyjson.com/comments/" + id;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyReview.fromJson(response.body());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Fetches multiple users from the dummyJSON API.
     * GET: https://dummyjson.com/comments
     *
     * @return the DummyUser[] object
     */
    public DummyReview[] fetchDummyReviews() {
        String url = "https://dummyjson.com/comments";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyReviews.fromJson(response.body()).getDummyReviews();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

