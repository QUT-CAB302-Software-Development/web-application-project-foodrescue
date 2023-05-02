//package application.demo.controllers;
//
//import application.demo.data.UserRepository;
//import application.demo.models.User;
//import ch.qos.logback.core.model.Model;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
///**
// * Controller for the login page.
// */
//@Controller
//public class LoginController {
//    /**
//     * The repository for user data.
//     */
//    @Autowired
//    private UserRepository userRepository;
//
//    /**
//     * Displays the login page.
//     *
//     * @param model The model to add attributes to.
//     * @return The name of the view to display.
//     */
//    @GetMapping("/login")
//    public String showLoginForm(Model model) {
//        // The user attribute is initialized to an empty user.
//        model.addText("user", new User("","",""));
//        // When the user first visits the login page, they are not registering.
//        model.addText("isRegistering", false);
//        return "login-view";
//    }
//
//    /**
//     * Attempts to log in the user. If successful, redirects to the main page. If
//     * unsuccessful, displays an error message and returns to the login page.
//     *
//     * @param model The model to add attributes to.
//     * @return The name of the view to display.
//     */
//    @RequestMapping(value = "/login", method = RequestMethod.POST, params = "login")
//    public String loginSubmit(@ModelAttribute User user, Model model, RedirectAttributes redirectAttrs) {
//        // Attempt to retrieve the user from the database.
//        User u = userDAO.getUser(user.getEmail());
//        if (u != null && u.getPassword().equals(user.getPassword())) {
//            // If the user is found and the password matches, update the user's name if it
//            // has been changed.
//            if (user.getName() != null && !user.getName().isEmpty())
//                u.setName(user.getName());
//
//            // Add the user to the redirect attributes so that it can be accessed by the
//            // main page controller.
//            redirectAttrs.addFlashAttribute("user", u);
//            return "redirect:/main";
//        }
//
//        // If the user is not found or the password does not match, display an error
//        model.addText("error", "Invalid email or password");
//        model.addText("isRegistering", false);
//        return "login-view";
//    }
//
//    /**
//     * Attempts to register the user. If successful, displays a success message and
//     * returns to the login page. If unsuccessful, displays an error message and returns
//     * to the login page.
//     *
//     * @param model The model to add attributes to.
//     * @return The name of the view to display.
//     */
//    @RequestMapping(value = "/login", method = RequestMethod.POST, params = "register")
//    public String registerSubmit(@ModelAttribute User user, Model model) {
//        if (userDAO.getUser(user.getEmail()) != null) {
//            model.addText("error", "Email already registered");
//        } else {
//            userDAO.addUser(user);
//            model.addText("success", "Registration successful. Please fill in your name before logging in.");
//            model.addText("isRegistering", true);
//        }
//        model.addText("user", user);
//        return "login-view";
//    }
//}
