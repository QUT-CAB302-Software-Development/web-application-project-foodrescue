package application.food_rescue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewPostController {
    @GetMapping("/new-post")
    public String home() {
        return "new-post";
    }

}
