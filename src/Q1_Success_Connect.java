import java.sql.*;

public class Q1_Success_Connect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root", "");
             ){
            System.out.println("Connection has been established successfully");
        }
        catch (Exception e) {
            System.out.println("Connection could not be established due to some error.");
        }
    }
}
