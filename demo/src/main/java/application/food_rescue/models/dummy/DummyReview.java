package application.food_rescue.models.dummy;

import com.google.gson.Gson;

public class DummyReview {

    private int id;
    private String review_title;
    private String body;
    private String username;

    public int getId() {
        return id;
    }


    public String getuserName() {
        return username;
    }

    public String getReview_description() {
        return body;
    }

    @Override
    public String toString() {
        return "reviews{" +
                "id=" + id +
                ", username=" + username +
                ", full_review=" + body +
                "}";
    }

    /**
     * Converts a JSON string to a DummyUser object using GSon.
     *
     * @param json the JSON string to convert
     * @return the DummyUser object
     */
    public static DummyReview fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyReview.class);
    }


}
