package application.food_rescue.models.dummy;

import com.google.gson.Gson;

public class DummyReview {
        private int id;
        private String review_title;
        private String review_description;
        private String userName;


        public DummyReview(String userName, String description) {
            this.review_description = description;
            this.userName = userName;
            this.review_title = review_description.substring(0, 15) + "...";
        }


        public void setReview_title(String review_title) {
            this.review_title = review_title;
        }

        public String getReview_description() {
            return review_description;
        }

        public void setReview_description(String review_description) {
            this.review_description = review_description;
        }

    public String toString() {
        return "comments[{" +
                "id=" + id +
                ", userName=" + userName +
                ", title" + review_title +
                ", full_review=" + review_description +
                "}]";
    }
        public static DummyReview fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyReview.class);
        }

}
