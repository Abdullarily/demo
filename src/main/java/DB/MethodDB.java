package DB;

import java.sql.*;
import java.sql.Connection;

public class MethodDB {
    static final String url = "jdbc:mysql://localhost:3306/javaShpargalki";
    static final String driverName = "com.mysql.cj.jdbc.Driver";
    static final String user = "root";
    static final String password = "0511171AbAb";

    public static String  returnTextDB(String nameText) throws SQLException {
        TestConnection testConnection = new TestConnection();
        Connection conn = testConnection.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        String query = "select * from String";
        ResultSet rs = statement.executeQuery(query);
        int id;
        String text = null;
        String name = "";
        String returnText = "";

        while (rs.next()) {
            id = rs.getInt("id");
            name = rs.getString("name");
            text = rs.getString("text");
            if(name.equals(nameText)) {
                returnText = text;
            }
        }

        statement.close();
        conn.close();

        return returnText;
    }
}
