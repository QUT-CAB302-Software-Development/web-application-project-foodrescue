//package application.demo.controllers;
//
//
//import application.demo.data.UserRepository;
//import application.demo.models.User;
//import ch.qos.logback.core.model.Model;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
///**
// * Controller for the main page, displayed after the user has logged in.
// */
//@Controller
//public class MainViewController {
//    /**
//     * The repository for user data.
//     */
//    @Autowired
//    private UserRepository userRepository;
//
//    /**
//     * Displays the main page.
//     *
//     * @param model The model that defines the attributes to be displayed.
//     * @return The name of the view to display.
//     */
//    @GetMapping("/main")
//    public String main(Model model) {
//        User user = (User) model.getTag("user");
//        model.addText("user", user);
//        model.addText("users", userDAO.listUsers());
//        return "main-view";
//    }
//
//    /**
//     * Logs the user out.
//     *
//     * @return The name of the view to display.
//     */
//    @PostMapping("/logout")
//    public String logout() {
//        return "redirect:/login";
//    }
//}
