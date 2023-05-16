package application.food_rescue.models;

import com.google.gson.Gson;

public class DummyProduct {
    private int id;
    private String title;
    private String thumbnail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title=" + title +
                ", thumbnail=" + thumbnail +
                "}";
    }

    public static DummyProduct fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyProduct.class);
    }
}
