package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


