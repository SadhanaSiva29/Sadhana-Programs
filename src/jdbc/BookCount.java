package jdbc;

import java.sql.*;

public class BookCount {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        String sql = "SELECT count(*) As total From  books";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                int count = resultSet.getInt("total");
                System.out.println("Total number of records in the books table: " + count);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
