package Connection;

import java.sql.*;

public class Connection {

    final static String url = "jdbc:postgresql://localhost:5432/postgres";
    final static String username = "postgres";
    final static String password = "1234";

    static java.sql.Connection connection = null;

    public static java.sql.Connection conectToDB() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
