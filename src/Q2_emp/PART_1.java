package Q2_emp;

import java.sql.*;

public class PART_1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root", "");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT empno, ename FROM emp");
        try{
            System.out.println("empno\tename");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString("ename"));
            }
        }catch (SQLException e){
            System.out.println("Connection could not be established due to some error.");
        }
    }
}
