package application.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewPostController {
    @GetMapping("/NewPost")
    public String home() {
        return "new-post";
    }

}
