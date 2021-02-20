package PLSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    final static String createTable = "DROP TABLE IF EXISTS tareas; CREATE TABLE tareas(comercial_id integer, agenda varchar[][]);";

    public static void createTableTareas(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(createTable);
        System.out.println("Tabla creada.");
    }
}
