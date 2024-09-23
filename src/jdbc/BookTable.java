package jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookTable {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE books (id integer, title varchar(40), author varchar(20))");
            System.out.println("Connected to the database!");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
}
