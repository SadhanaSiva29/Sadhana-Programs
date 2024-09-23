package jdbc;

import java.sql.*;
import java.util.Scanner;

public class BooksSelect {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        Scanner scanner = new Scanner(System.in);
        String sql = "SELECT * From  books where title like ?";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String author = scanner.next();
            preparedStatement.setString(1, author);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String author1 = resultSet.getString("author");
                System.out.println("title: " + title +"\nauthor:"+author1);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
