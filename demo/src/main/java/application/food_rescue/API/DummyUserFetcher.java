package application.food_rescue.API;
import java.net.URI;
import java.net.http.*;

public class DummyUserFetcher {
    private HttpClient client = HttpClient.newHttpClient();

    /**
     * Fetches a user from the dummyJSON API.
     * GET: https://dummyjson.com/users/{id}
     *
     * @param id the ID of the user to fetch
     * @return the DummyUser object
     */
    public DummyUser fetchDummyUser(int id) {
        String url = "https://dummyjson.com/users/" + id;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyUser.fromJson(response.body());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Fetches multiple users from the dummyJSON API.
     * GET: https://dummyjson.com/users
     *
     * @return the DummyUser[] object
     */
    public DummyUser[] fetchDummyUsers() {
        String url = "https://dummyjson.com/users";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyUsers.fromJson(response.body()).getDummyUsers();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
