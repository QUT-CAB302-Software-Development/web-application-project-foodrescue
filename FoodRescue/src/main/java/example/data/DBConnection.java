package example.data;

/**
 * Provides a singleton instance of the MySQL database connection.
 */
public class DBConnection {
    /**
     * The singleton instance of the MySQL database connection.
     */
    private static MySQLDatabaseConnection instance = null;

    /**
     * Constructor intializes the connection.
     */
    private DBConnection() {
        instance = new MySQLDatabaseConnection();
    }

    /**
     * Provides global access to the singleton instance of the MySQL database connection.
     *
     * @return a handle to the singleton instance of the MySQL database connection.
     */
    public static MySQLDatabaseConnection getInstance() {
        if (instance == null) {
            new DBConnection();
        }
        return instance;
    }
}
