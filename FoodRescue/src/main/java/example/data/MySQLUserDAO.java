package example.data;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Provides basic CRUD functionality needed by a data access object to store and retrieve
 * information about a User. This implementation uses a MySQL database connection.
 */
public class MySQLUserDAO implements UserDAO {
    private final Connection connection;

    /**
     * Constructor initializes the connection.
     */
    public MySQLUserDAO(String url, String username, String password) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        createTableIfNotExists();
    }

    private void createTableIfNotExists() throws SQLException {
        String createTable = "CREATE TABLE IF NOT EXISTS users ("
                + "name VARCHAR(255) NOT NULL,"
                + "password VARCHAR(255) NOT NULL,"
                + "email VARCHAR(255) PRIMARY KEY)";

        try (Statement statement = connection.createStatement()) {
            statement.execute(createTable);
        }
    }

    @Override
    public void addUser(User user) throws SQLException {
        String addUser = "INSERT INTO users (name, password, email) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(addUser)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.executeUpdate();
        }
    }

    @Override
    public User getUser(String email) throws SQLException {
        String getUser = "SELECT * FROM users WHERE email = ?";

        try (PreparedStatement statement = connection.prepareStatement(getUser)) {
            statement.setString(1, email);

            try (ResultSet result = statement.executeQuery()) {
                if (result.next()) {
                    String name = result.getString("name");
                    String password = result.getString("password");
                    return new User(name, password, email);
                } else {
                    return null;
                }
            }
        }
    }

    @Override
    public void updateUser(User user) throws SQLException {
        String updateUser = "UPDATE users SET name = ?, password = ? WHERE email = ?";

        try (PreparedStatement statement = connection.prepareStatement(updateUser)) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteUser(String email) throws SQLException {
        String deleteUser = "DELETE FROM users WHERE email = ?";

        try (PreparedStatement statement = connection.prepareStatement(deleteUser)) {
            statement.setString(1, email);
            statement.executeUpdate();
        }
    }

    @Override
    public Set<User> listUsers() throws SQLException {
        String listUsers = "SELECT * FROM users";

        try (PreparedStatement statement = connection.prepareStatement(listUsers)) {
            Set<User> users = new HashSet<>();

            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    String name = result.getString("name");
                    String password = result.getString("password");
                    String email = result.getString("email");
                    users.add(new User(name, password, email));
                }

                return users;
            }
        }
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }
}
