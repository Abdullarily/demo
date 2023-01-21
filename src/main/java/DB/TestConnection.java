package DB;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    private java.sql.Connection connection;
    public TestConnection() throws SQLException {
        DriverManager.registerDriver(new FabricMySQLDriver());
    }
    public Connection getConnection(String url, String username, String password) throws SQLException {
        if(connection != null) {
            return connection;
        }
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
