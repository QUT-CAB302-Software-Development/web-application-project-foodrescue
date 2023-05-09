package application.food_rescue.data;

import application.food_rescue.models.BusinessPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//Add a comment
@Repository
public interface BusinessPageRepository extends CrudRepository<BusinessPage, Integer> {
}
