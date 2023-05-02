package application.demo;
import application.demo.models.FoodListing;
import application.demo.models.Listings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListingsTests {
    Listings listings = new Listings();

    FoodListing firstListing = new FoodListing("My Listing", "Yummy food", 3, new ArrayList<String>(
            Arrays.asList("Gluten Free", "Vegan")), LocalDateTime.of(2015,
            Month.JULY, 29, 19, 30, 40), "Coles");

    @BeforeEach
    @Test
    void testAddListing(){
        listings.addListing(firstListing);
    }

    @Test
    void testViewListings(){
        System.out.println(listings.getAllListings());
    }
    @Test
    void testFoodListingConstructor(){
        assertEquals("Yummy food", firstListing.getDescription());
    }

    @Test
    void testSetTitle(){
        firstListing.setTitle("Another Listing");
        assertEquals("Another Listing", firstListing.getTitle());
    }

    @Test
    void testSetDietary(){
        firstListing.setDietaryDetails(Arrays.asList("Gluten Free", "Vegetarian"));
        assertEquals(Arrays.asList("Gluten Free", "Vegetarian"), firstListing.getDietaryDetails());
    }
    @Test
    void testDietaryFilter(){
        List<FoodListing> matchingListings = listings.dietaryFilter(listings.allListings, "Gluten Free");
        System.out.println(matchingListings.size());
    }
}