package application.food_rescue;

import application.food_rescue.models.DummyProduct;
import application.food_rescue.controllers.DummyProductFetcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodRescueApplication {

	public static void main(String[] args) {
		/* Code for Single Product */
		DummyProductFetcher fetcher = new DummyProductFetcher();
		DummyProduct product = fetcher.fetchDummyProduct(1);
		System.out.println(product);

		/* Code for Multiple Products */
		DummyProduct[] products = fetcher.fetchDummyProducts();
		for (DummyProduct p : products) {
			System.out.println(p);
		}

		SpringApplication.run(FoodRescueApplication.class, args);
	}

}
