package jdbc_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Basic Database Operations Using SQL Server

public class JdbcW {
    public static void main(String[] args) {
       // String url = "jdbc:sqlserver://localhost\\SQLEXPRESS03;databaseName=UserDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
    	String url = "jdbc:sqlserver://localhost:1433;databaseName=UserDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
 
        try {
            // Load the JDBC driver (optional for newer versions)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
            // Connect using Windows Authentication
            Connection conn = DriverManager.getConnection(url);
 
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users");
 
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
 
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 