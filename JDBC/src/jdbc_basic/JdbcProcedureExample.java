package jdbc_basic;

import java.sql.*;

public class JdbcProcedureExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;encrypt=true;trustServerCertificate=true";
        String user = "your_username";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to SQL Server.");

            // Step 1: Prepare the CallableStatement
            CallableStatement stmt = conn.prepareCall("{call GetUserById(?)}");

            // Step 2: Set input parameter
            stmt.setInt(1, 1); // Assuming you want user with ID = 1

            // Step 3: Execute the procedure
            ResultSet rs = stmt.executeQuery();

            // Step 4: Process the result
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
