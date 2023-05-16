package application.food_rescue.models;

import com.google.gson.Gson;

public class DummyProducts {
    private DummyProduct[] products;

    public DummyProduct[] getDummyProducts() {
        return products;
    }

    /**
     * Converts a JSON string to a DummyProducts object using GSon.
     *
     * @param json the JSON string to convert
     * @return the DummyProducts object
     */
    public static DummyProducts fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyProducts.class);
    }
}
