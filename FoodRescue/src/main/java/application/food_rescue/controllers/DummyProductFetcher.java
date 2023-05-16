package application.food_rescue.controllers;

import application.food_rescue.models.DummyProduct;
import application.food_rescue.models.DummyProducts;

import java.net.URI;
import java.net.http.*;

public class DummyProductFetcher {
    private HttpClient client = HttpClient.newHttpClient();

    /**
     * Fetches a product from the dummyJSON API.
     * GET: https://dummyjson.com/products/{id}
     *
     * @param id the ID of the product to fetch
     * @return the DummyProduct object
     */
    public DummyProduct fetchDummyProduct(int id) {
        String url = "https://dummyjson.com/products/" + id;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyProduct.fromJson(response.body());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Fetches multiple products from the dummyJSON API.
     * GET: https://dummyjson.com/products
     *
     * @return the DummyProduct[] object
     */
    public DummyProduct[] fetchDummyProducts() {
        String url = "https://dummyjson.com/products/category/skincare";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return DummyProducts.fromJson(response.body()).getDummyProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
