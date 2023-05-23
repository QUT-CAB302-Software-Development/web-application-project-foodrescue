package application.food_rescue.controllers;

import application.food_rescue.data.FoodListingRepository;
import application.food_rescue.models.FoodListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListingPageController {

    @Autowired
    private FoodListingRepository listingRepo;

    @GetMapping("/listings-page")
    public String showNewListings(Model model) {
        List<FoodListing> allListings = listingRepo.findAllListings();
        model.addAttribute("listings", allListings );
        return "listings-page";
    }
}
