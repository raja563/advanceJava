import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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

            // create a query 
            String q="insert into table1(tName,tCity) values(?,?)";

            // get the preparedStatement
           PreparedStatement pst= con.prepareStatement(q);
        //    set the values to query 

           System.out.println("enter your name:");
           String name=sc.nextLine();
           System.out.println("enter your city:");
           String city=sc.nextLine();
           pst.setString(1,name);
           pst.setString(2,city);
           pst.executeUpdate();

           System.out.println("data inserted...");

           con.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
