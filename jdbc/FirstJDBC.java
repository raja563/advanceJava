import java.sql.*;

class FirstJDBC {
    public static void main(String[] args) {
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


            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}