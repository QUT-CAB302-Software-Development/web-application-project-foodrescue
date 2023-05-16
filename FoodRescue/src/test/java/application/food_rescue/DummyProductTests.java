package application.food_rescue;

import application.food_rescue.controllers.DummyProductFetcher;
import application.food_rescue.models.DummyProduct;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DummyProductTests {

    DummyProductFetcher fetcher = new DummyProductFetcher();
    DummyProduct product;

    @BeforeEach
    void createDummyProduct(){
        product = fetcher.fetchDummyProduct(6);
    }
    @Test
    void testIDFetched(){
        assertEquals(6, product.getId());
    }

    @Test
    void testValidImageUrl(){
        assertTrue(isImageUrl(product.getThumbnail()));
    }

    @Test
    void testInvalidImageUrl(){
        assertFalse(isImageUrl(product.getTitle()));
    }

    private boolean isImageUrl(String url) {
        if (url == null || url.isEmpty()) {
            return false;
        }

        String lowercaseUrl = url.toLowerCase();
        return lowercaseUrl.endsWith(".jpg") || lowercaseUrl.endsWith(".jpeg")
                || lowercaseUrl.endsWith(".png") || lowercaseUrl.endsWith(".gif");
    }

}
