package Menu;

import Connection.Connection;
import PLSQL.CreateTable;
import PLSQL.Insert;
import PLSQL.Querys;
import PLSQL.Update;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    static Scanner s = new Scanner(System.in);

    public static void Menu() throws SQLException {
        boolean salir = true;
        while (salir) {
            menuOptions();
            int option = s.nextInt();
            switch (option) {
                case 1:
                    CreateTable.createTableTareas(Connection.conectToDB());
                    break;
                case 2:
                    Insert.insertToTable(Connection.conectToDB());
                    break;
                case 3:
                    Querys.dayOneQuery(Connection.conectToDB());
                    break;
                case 4:
                    Querys.dayTwoQuery(Connection.conectToDB());
                    break;
                case 5:
                    Update.updateField(Connection.conectToDB());
                    break;
                case 6:
                    Querys.showAll(Connection.conectToDB());
                    break;
                case 7:
                    System.out.println("Adiós.");
                    System.exit(0);
                    salir = false;
                    break;
            }
        }

    }

    private static void menuOptions() {
        System.out.println("***********************************************************************************");
        System.out.println("¿Qué quiere hacer?");
        System.out.println("1.- Crear tabla. (SE BORRA SI EXISTE)");
        System.out.println("2.- Insertar dos comerciales.");
        System.out.println("3.- Tareas del primer dia.");
        System.out.println("4.- Tareas del segundo dia.");
        System.out.println("5.- Modificar tarea.");
        System.out.println("6.- Mostrar todos los comerciales.");
        System.out.println("7.- Salir");
        System.out.println("***********************************************************************************");
    }
}
