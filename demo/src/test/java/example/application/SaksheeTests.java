package example.application;

import example.data.BusinessPage;
import example.data.Exceptions.InvalidReviewException;
import example.data.Review;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SaksheeTests {

	private BusinessPage businessPage;
	@BeforeEach
	void createBusiness() {
		// Create a new business page
		businessPage = new BusinessPage("Woolworths");
	}

	@Test
	void testGetNumberOfReviews() throws Exception {
		
		// Add some reviews to the business page
		businessPage.addReview(new Review("Great product!", "This product is amazing, I would definitely recommend it.", 5));
		businessPage.addReview(new Review("Terrible customer service", "I had a horrible experience with this company.", 1));

		// Get the number of reviews
		int numberOfReviews = businessPage.getNumberOfReviews();

		// Assert that the number of reviews is correct
		assertEquals(2, numberOfReviews);
	}

	@Test
	void testGetAverageRating() throws Exception {
		// Create a new business page
		BusinessPage businessPage = new BusinessPage("Woolworths");

		// Add some reviews to the business page
		businessPage.addReview(new Review("Great product!", "This product is amazing, I would definitely recommend it.", 5));
		businessPage.addReview(new Review("Terrible customer service", "I had a horrible experience with this company.", 1));

		// Get the average rating
		double averageRating = businessPage.getAverageRating();

		// Assert that the average rating is correct
		assertEquals(3.0, averageRating, 0.01);
	}

	@Test
	void testAddAndRetrieveReview() throws Exception {
		// Create a new business page
		BusinessPage businessPage = new BusinessPage("Woolworths");

		// Create a new review
		Review review = new Review("Great product!", "This product is amazing, I would definitely recommend it.", 5);

		// Add the review to the business page
		businessPage.addReview(review);

		// Get the reviews from the business page
		List<Review> reviews = businessPage.getReviews();

		// Assert that the review was added and retrieved successfully
		assertTrue(reviews.contains(review));
	}

	@Test
	void testInvalidRating() throws Exception {
		// Create a new business page
		BusinessPage businessPage = new BusinessPage("Woolworths");

		// Create a new review with an invalid rating
		assertThrows(InvalidReviewException.class, () -> new Review("Great product!", "This product is amazing, I would definitely recommend it.", 0));
	}

	@Test
	void testNullReview() {
		// Create a new business page
		BusinessPage businessPage = new BusinessPage("Woolworths");

		// Attempt to add a null review to the business page
		assertThrows(InvalidReviewException.class, () -> businessPage.addReview(null));
	}






}
