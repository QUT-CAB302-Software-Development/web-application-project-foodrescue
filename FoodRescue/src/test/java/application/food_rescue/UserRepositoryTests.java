//package application.food_rescue;
//
//import application.food_rescue.data.UserRepository;
//import application.food_rescue.models.User;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(
//        replace = Replace.NONE
//)
//@Rollback(false)
//public class UserRepositoryTests {
//    @Autowired
//    private TestEntityManager entityManager;
//    @Autowired
//    private UserRepository repo;
//
//    public UserRepositoryTests() {
//    }
//
//    @Test
//    public void testCreateUser() {
//        User user = new User();
//        user.setEmail("ravikumar@gmail.com");
//        user.setPassword("ravi2020");
//        user.setFirstName("Ravi");
//        user.setLastName("Kumar");
//        User savedUser = (User)this.repo.save(user);
//        User existUser = (User)this.entityManager.find(User.class, savedUser.getId());
//        Assertions.assertEquals(user.getEmail(), existUser.getEmail());
//    }
//}
