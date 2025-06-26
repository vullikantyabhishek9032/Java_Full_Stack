package jdbc_basic;

import java.sql.*;

public class Crud_operations {

  static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=UserDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

  public static void main(String[] args) {

      try {

          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

          Connection conn = DriverManager.getConnection(URL);

          // Perform CRUD operations

          createUser(conn, "Pradeep");

          readUsers(conn);

          updateUser(conn, 3, "Suman");

          deleteUser(conn, 10);

          UpreadUsers(conn);

          conn.close();

      } catch (Exception e) {

          e.printStackTrace();

      }

  }

  // CREATE

  public static void createUser(Connection conn, String name) throws SQLException {

      String sql = "INSERT INTO Users (name) VALUES (?)";

      try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

          pstmt.setString(1, name);

          pstmt.executeUpdate();

          System.out.println("User created: " + name);

      }

  }

  // READ

  public static void readUsers(Connection conn) throws SQLException {

      String sql = "SELECT * FROM Users";

      try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

          while (rs.next()) {

              System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));

          }

      }

  }

  // UPDATE

  public static void updateUser(Connection conn, int id, String newName) throws SQLException {

      String sql = "UPDATE Users SET name = ? WHERE id = ?";

      try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

          pstmt.setString(1, newName);

          pstmt.setInt(2, id);

          int rows = pstmt.executeUpdate();

          System.out.println("Updated " + rows + " row(s).");

      }

  }

  // DELETE

  public static void deleteUser(Connection conn, int id) throws SQLException {

      String sql = "DELETE FROM Users WHERE id = ?";

      try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

          pstmt.setInt(1, id);

          int rows = pstmt.executeUpdate();

          System.out.println("Deleted " + rows + " row(s).");

      }

  }

  public static void UpreadUsers(Connection conn) throws SQLException {

      String sql = "SELECT * FROM Users";

      try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

          while (rs.next()) {

              System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));

          }

      }

  }

}
