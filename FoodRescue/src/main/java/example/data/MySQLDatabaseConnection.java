package example.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;

/**
 * Represents a MySQL database connection.
 */
public class MySQLDatabaseConnection {
    /**
     * The MySQL database connection.
     */
    private Connection connection;

    /**
     * The MySQL url.
     */
    @Value("${spring.datasource.url}")
    private String url;

    /**
     * The MySQL username.
     */
    @Value("${spring.datasource.username}")
    private String username;

    /**
     * The MySQL password.
     */
    @Value("${spring.datasource.password}")
    private String password;

    /**
     * Constructor initializes the MySQL database connection.
     */
    public MySQLDatabaseConnection() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connect to the MySQL database using the username and password from the properties file
            connection = DriverManager.getConnection(
                url,
                username,
                password
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the list of users from the "users" table in the MySQL database.
     *
     * @return The list of users.
     */
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        
        try {
            // Execute a SELECT query to get all the users from the "users" table
            String sql = "SELECT * FROM users";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            // Convert each row of the result set to a User object and add it to the list
            while (resultSet.next()) {
                User user = new User(
                    resultSet.getString("email"),
                    resultSet.getString("username"),
                    resultSet.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return users;
    }
}
