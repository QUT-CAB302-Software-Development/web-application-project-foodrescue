package application.food_rescue;

import application.food_rescue.API.DummyUser;
import application.food_rescue.API.DummyUserFetcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodRescueApplication {

	public static void main(String[] args) {


		SpringApplication.run(FoodRescueApplication.class, args);
		DummyUserFetcher fetcher = new DummyUserFetcher();
		DummyUser[] users = fetcher.fetchDummyUsers();
		for (DummyUser user : users) {
			System.out.println(user);
		}

	}

}
