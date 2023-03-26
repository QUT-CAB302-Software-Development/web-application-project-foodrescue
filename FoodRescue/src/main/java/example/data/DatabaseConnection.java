package example.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Represents a database connection to a MySQL database using Spring JDBC.
 */
public class DatabaseConnection {
    /**
     * The JDBC template for executing SQL queries against the database.
     */
    private final JdbcTemplate jdbcTemplate;

    /**
     * Constructor initializes the JDBC template.
     */
    public DatabaseConnection() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
        dataSource.setUsername("myuser");
        dataSource.setPassword("mypassword");
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /**
     * Gets the list of users from the database.
     *
     * @return The list of users.
     */
    public List<User> getUsers() {
        String sql = "SELECT * FROM users";
        List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
        return users;
    }

    /**
     * Maps a row in the ResultSet to a User object.
     */
    private static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            return user;
        }
    }
}
