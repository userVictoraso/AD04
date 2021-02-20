package PLSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    final static String updateQuery = "UPDATE tareas SET agenda[1:1] = '{\"nuevaTarea, 3\"}' WHERE comercial_id = 1";

    public static void updateField(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        statement.executeUpdate(updateQuery);

        System.out.println("Modificación realizada.");
    }
}
