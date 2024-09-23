package jdbc;

import java.sql.*;
import java.util.Scanner;

public class BookDelete {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        String sql = "delete from books where id=?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);

            int id1 = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id1);
            preparedStatement.execute();
            System.out.println("deleted");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
