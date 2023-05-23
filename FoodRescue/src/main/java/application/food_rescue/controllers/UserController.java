package application.food_rescue.controllers;

import application.food_rescue.data.UserRepository;
import application.food_rescue.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/")
    public String showLandingPage(Model model) {
        return "landing-page";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login_form";
    }


    @PostMapping("/process_login")
    public String authenticateUser(Model model, User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String inputPass = user.getPassword();
        User foundUser = userRepo.findByUserEmail(user.getEmail());

        if(foundUser != null){
            if(passwordEncoder.matches(inputPass, foundUser.getPassword())) {
                System.out.println("Login Successful!");
                return "redirect:/listings-page";
            }
            else {
                String errorMessage = "Incorrect email or password";
                model.addAttribute("errorMessage", errorMessage);
                return "error";
            }
        }
        else {
            String errorMessage = "This user doesn't exist.";
            model.addAttribute("errorMessage", errorMessage);
            return "error";
        }

    }
}
