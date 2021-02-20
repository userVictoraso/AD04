package PLSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Querys {

    final static String queryOne = "SELECT tareas.comercial_id, agenda[1:1] FROM tareas";
    final static String queryTwo = "SELECT tareas.comercial_id, agenda[2:2] FROM tareas";
    final static String queryThree = "SELECT tareas.comercial_id, agenda FROM tareas";

    public static void dayOneQuery(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(queryOne);

        while (resultSet.next()){
            System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2));
        }
        System.out.println("Comerciales mostrados.");
    }

    public static void dayTwoQuery(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(queryTwo);

        while (resultSet.next()){
            System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2));
        }
        System.out.println("Comerciales mostrados.");
    }

    public static void showAll(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(queryThree);

        while (resultSet.next()){
            System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2));
        }
        System.out.println("Comerciales mostrados.");
    }
}
