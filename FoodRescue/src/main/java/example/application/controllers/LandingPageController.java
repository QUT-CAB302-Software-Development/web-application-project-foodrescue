package example.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LandingPageController {

    @GetMapping("/landing-page")
    public String showLandingPage(Model model) {
        return "landing-page";
    }

    @RequestMapping("/landing-page")
    public String showLandingPage2(Model model) {
        return "landing-page";
    }
}
