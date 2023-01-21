package DB;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    static final String url = "jdbc:mysql://localhost:3306/javaShpargalki";
    static final String driverName = "com.mysql.cj.jdbc.Driver";
    static final String user = "root";
    static final String password = "0511171AbAb";

    static Connection conn;

    public static Connection mysqlConnection() throws ClassNotFoundException {
        Class.forName(driverName);
        try(java.sql.Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Успешное подключение");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
