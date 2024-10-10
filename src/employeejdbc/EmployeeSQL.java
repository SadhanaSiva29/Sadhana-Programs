package employeejdbc;

import java.sql.*;

public class EmployeeSQL  {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=sa_practice;encrypt=true;trustServerCertificate=true";
        String user = "sadhana";
        String password = "sadhana@29";
        String sql = "CREATE TABLE employees(employee_Id VARCHAR(50) PRIMARY KEY," +
                "firstName VARCHAR(50) NOT NULL," +
                "lastName VARCHAR(50) NOT NULL," +
                "middleName VARCHAR(50)," +
                "dateOfBirth DATE NOT NULL," +
                "gender VARCHAR(10)," +
                "emailAddress VARCHAR(50) NOT NULL," +
                "phoneNumber VARCHAR(50) NOT NULL," +
                "address VARCHAR(50) NOT NULL," +
                "jobTitle VARCHAR(50) NOT NULL," +
                "department VARCHAR(50) NOT NULL," +
                "managerId VARCHAR(50) NOT NULL, " +
                "dateofJoining DATE NOT NULL," +
                "employmentstatus VARCHAR(50) NOT NULL," +
                "salary Integer NOT NULL," +
                "workSalary VARCHAR(50)," +
                "emergencyContact Integer," +
                "skills VARCHAR(50)," +
                "education VARCHAR(50)," +
                "certification VARCHAR(50)," +
                "performanceReviews VARCHAR(50)," +
                "panNumber VARCHAR(50) NOT NULL UNIQUE ," +
                "aadharNumber VARCHAR(50) NOT NULL UNIQUE ," +
                "bankAccountDetails VARCHAR(50) NOT NULL UNIQUE) " ;
        String insert = "INSERT INTO employees VALUES('CSA001','Sadhana','S',null,'2004-09-29'," +
                "'female' , 'sdhfdi@gmail.com', '809809809','kanchipuram', 'Intern', 'BCA', 'CMA7876', '2024-07-15', 'full-time',90000,null,0764856385,'Intelligent','BCA',null,null,08686,8657689837,'indian0464643')";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


