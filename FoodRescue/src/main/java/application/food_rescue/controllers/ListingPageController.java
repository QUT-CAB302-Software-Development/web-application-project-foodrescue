package application.food_rescue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListingPageController {

    @GetMapping("/listings-page")
    public String showLandingPage(Model model) {
        return "listings-page";
    }

    @RequestMapping("/listings-page")
    public String showLandingPage2(Model model) {
        return "listings-page";
    }
}
