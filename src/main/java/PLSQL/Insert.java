package PLSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

    final static String insert = "INSERT INTO tareas VALUES (1, '{{\"desayunar, 11\"}, {\"comer, 12\"}, {\"merendar, 21\"}, {\"cenar, 22\"}}');" +
            "INSERT INTO tareas VALUES (2, '{{\"reunion, 11\"}, {\"clases, 12\"}, {\"jugar, 21\"}, {\"dormir, 22\"}}');";

    public static void insertToTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(insert);
        statement.close();
        System.out.println("Inserciones realizadas.");
    }
}
