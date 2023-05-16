package application.food_rescue.controllers;

import application.food_rescue.models.DummyProduct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class DummyController {
    @GetMapping("/products")
    public String showProducts(Model model) {

        Random rand = new Random();
        int id = rand.nextInt(10);

        DummyProductFetcher fetcher = new DummyProductFetcher();

        DummyProduct product = fetcher.fetchDummyProduct(id);
        model.addAttribute("product_image", product.getThumbnail());

        return "dummy_product";
    }
}
