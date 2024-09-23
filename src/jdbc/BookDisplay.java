package jdbc;

import java.sql.*;

public class BookDisplay {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        String sql = "SELECT * From  books";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String author_name = resultSet.getString("title");
                String book_name = resultSet.getString("author");

                System.out.println("ID: " + id + ", Author_Name: " + author_name + ", Book_Name: "
                        + book_name );
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
