package application.food_rescue.models.dummy;
import java.net.URI;
import java.net.http.*;

public class DummyReviewFetcher {
    private HttpClient client = HttpClient.newHttpClient();

        /**
         * Fetches a comment from the dummyJSON API.
         * GET: https://dummyjson.com/comments/{id}
         *
         * @param id the ID of the comment to fetch
         * @return the DummyReview object
         */
        public DummyReview fetchDummyReview(int id) {
            String url = "https://dummyjson.com/comments" + id;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
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
         * Fetches multiple comments from the dummyJSON API.
         * GET: https://dummyjson.com/comments
         *
         * @return the DummyReivew[] object
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

