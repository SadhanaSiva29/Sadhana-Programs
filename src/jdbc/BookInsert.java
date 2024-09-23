package jdbc;

import java.sql.*;

public class BookInsert {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        String sql = "INSERT INTO books VALUES (?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1004);
            preparedStatement.setString(2, "HP4");
            preparedStatement.setString(3, "JK Rowlings4");
//            preparedStatement.setInt(1,1003);
//            preparedStatement.setString(2,"HP1");
//            preparedStatement.setString(3,"JK Rowlings1");
            System.out.println("Inserted successfully");
            preparedStatement.executeUpdate();
            //System.out.println("Connected to the database!");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
