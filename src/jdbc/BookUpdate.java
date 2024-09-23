package jdbc;

import java.sql.*;
import java.text.AttributedCharacterIterator;
import java.util.Scanner;

public class BookUpdate {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        String sql = "update books set title=? where id=?";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            String title = scanner.nextLine();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int id = scanner.nextInt();
            preparedStatement.setString(1, title);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
//            System.out.println("deleted");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
