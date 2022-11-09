package Singleton;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Singleton {
    private String url;
    private String user;
    private String passwd;
    Connection con;
    private Connection getNewConnection() throws SQLException {
        String url = "jdbc:h2:mem:test";
        String user = "sa";
        String passwd = "sa";
        return DriverManager.getConnection(url, user, passwd);
    }
    private Singleton() throws SQLException {
        con = DriverManager.getConnection(url, user, passwd);
    }

    private static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE;

        static {
            try {
                HOLDER_INSTANCE = new Singleton();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    @Test
    public void shouldGetJdbcConnection() throws SQLException {
        try(Connection connection = getNewConnection()) {
            assertTrue(connection.isValid(1));
            assertFalse(connection.isClosed());
        }
    }
}
