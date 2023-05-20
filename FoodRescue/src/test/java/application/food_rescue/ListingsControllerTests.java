//package application.food_rescue;
//import application.food_rescue.models.FoodListing;
//import application.food_rescue.controllers.ListingsController;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ListingsControllerTests {
//    ListingsController listingsController = new ListingsController();
//
//    FoodListing firstListing = new FoodListing("My Listing", "Yummy food", 3,
//            ("Gluten Free, Vegan"), LocalDateTime.of(2015,
//            Month.JULY, 29, 19, 30, 40), "Coles");
//
//    @BeforeEach
//    @Test
//    void testAddListing(){
//        listingsController.addListing(firstListing);
//    }
//
//    @Test
//    void testViewListings(){
//        System.out.println(listingsController.getAllListings());
//    }
//    @Test
//    void testFoodListingConstructor(){
//        assertEquals("Yummy food", firstListing.getDescription());
//    }
//
//    @Test
//    void testSetTitle(){
//        firstListing.setTitle("Another Listing");
//        assertEquals("Another Listing", firstListing.getTitle());
//    }
//
//    @Test
//    void testSetDietary(){
//        firstListing.setDietaryDetails("Gluten Free, Vegetarian");
//        assertEquals(("Gluten Free, Vegetarian"), firstListing.getDietaryDetails());
//    }
//    @Test
//    void testDietaryFilter(){
//        List<FoodListing> matchingListings = listingsController.dietaryFilter(listingsController.allListings, "Gluten Free");
//        assertEquals(matchingListings.size(), 1);
//    }
//}