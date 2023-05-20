package application.food_rescue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LandingPageController {

    @GetMapping("/")
    public String showLandingPage(Model model) {
        return "landing-page";
    }

}
