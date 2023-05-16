package application.food_rescue.data;

import application.food_rescue.models.FoodListing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodListingRepository extends CrudRepository<FoodListing, Integer> {
}
