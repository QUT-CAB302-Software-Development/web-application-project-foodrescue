package application.food_rescue.controllers;

import application.food_rescue.data.FoodListingRepository;
import application.food_rescue.data.UserRepository;
import application.food_rescue.models.FoodListing;
import application.food_rescue.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class NewPostController {
    @Autowired
    private FoodListingRepository listingRepo;
    @GetMapping("/new-post")
    public String newPostForm(Model model) {
        model.addAttribute("listing", new FoodListing());
        return "new-post";
    }
    @PostMapping("/create_listing")
    public String createListing(FoodListing listing, Model model) {
        listingRepo.save(listing);

        return "redirect:/listings-page";
    }

}
