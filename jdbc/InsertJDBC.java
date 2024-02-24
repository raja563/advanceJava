import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertJDBC {
    public static void main(String[] args) throws SQLException {
         try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // creating a connection
            String url = "jdbc:mysql://localhost:3306/practice";
            String username = "root";
            String password = "r7a5j2a4@2025";
            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("connection Created...");
            }

            // create query 
            String q="create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null , tCity varchar(200))";
            // create a statement 
            
         PreparedStatement pst=con.prepareStatement(q);
           pst.executeUpdate(q);

           System.out.println("table created in database ....");

           con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * sql cmd for checking data in the database 

    1.  show databases;
    2.  use database_name;
    3.  show tables;
    4.  desc table_name;

 */