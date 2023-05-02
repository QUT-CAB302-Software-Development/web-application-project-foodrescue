package application.food_rescue;

import example.data.BusinessPage;
import example.data.Exceptions.InvalidReviewException;
import example.data.Review;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BusinessPageTest {

	private BusinessPage businessPage;

	@BeforeEach
	void createBusiness() {
		// Create a new business page
		businessPage = new BusinessPage("Woolworths");
	}

//	@AfterEach
//	void tearDown() {
//		//Remove all the reviews from a page
//		for(Review review : businessPage.getReviews()){
//
//		}
//	}

	@Test
	void testGetNumberOfReviews() throws Exception {

		// Add some reviews to the business page
		businessPage.addReview(new Review("Great food!", "The food was fresh and was a big portion, I would definitely recommend it.", 5));
		businessPage.addReview(new Review("Terrible customer service", "I had a horrible experience with this company.", 1));

		// Get the number of reviews
		int numberOfReviews = businessPage.getNumberOfReviews();

		// Assert that the number of reviews is correct
		assertEquals(2, numberOfReviews);
	}

	@Test
	void testGetAverageRating() throws Exception {

		// Add some reviews to the business page
		businessPage.addReview(new Review("Great food!", "The food was fresh and was a big portion, I would definitely recommend it.", 5));
		businessPage.addReview(new Review("Terrible customer service", "I had a horrible experience with this company.", 1));

		// Get the average rating
		double averageRating = businessPage.getAverageRating();

		// Assert that the average rating is correct
		assertEquals(3.0, averageRating, 0.01);
	}

	@Test
	void testAddAndRetrieveReview() throws Exception {

		// Create a new review
		Review review = new Review("Great food!", "The food was fresh and was a big portion, I would definitely recommend it.", 5);

		// Add the review to the business page
		businessPage.addReview(review);

		// Get the reviews from the business page
		List<Review> reviews = businessPage.getReviews();

		// Assert that the review was added and retrieved successfully
		assertTrue(reviews.contains(review));
	}

	@Test
	void testDeletingReview() throws InvalidReviewException {
		// Create two reviews
		Review good = new Review("Great food!", "The food was fresh and was a big portion, I would definitely recommend it.", 5);
		Review bad = new Review("Terrible customer service", "I had a horrible experience with this company.", 1);

		// Add good review to the page and delete it
		businessPage.addReview(good);
		// Assert that the review was deleted successfully
		businessPage.deleteReview(good);
		assertTrue(!businessPage.getReviews().contains(good));

		// Attempt to delete a review which does not exist on the page
		assertThrows(InvalidReviewException.class, () -> businessPage.deleteReview(bad));
	}

	@Test
	void testInvalidRating() {

		// Create new reviews with an invalid rating
		assertThrows(InvalidReviewException.class, () -> new Review("Great food!", "The food was fresh and was a big portion, I would definitely recommend it.", 0));
		assertThrows(InvalidReviewException.class, () -> new Review("Great food!", "The food was fresh and was a big portion, I would definitely recommend it.", 6));
	}

	@Test
	void testNullReview() {

		// Attempt to add a null review to the business page
		assertThrows(InvalidReviewException.class, () -> businessPage.addReview(null));
	}






}
