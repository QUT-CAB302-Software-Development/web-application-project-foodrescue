package application.food_rescue.data;

import application.food_rescue.models.FoodListing;
import application.food_rescue.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodListingRepository extends CrudRepository<FoodListing, Integer> {
    @Query(value = "SELECT * FROM food_listing", nativeQuery = true)
    public List<FoodListing> findAllListings();
}
