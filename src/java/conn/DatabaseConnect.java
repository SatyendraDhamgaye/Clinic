package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/clinic";
    
    
    static final String USER = "root";
    static final String PASS = "LavragreenV2";
    public  static Connection connectDB(){
        Connection con = null;
        
        try {
            Class.forName(JDBC_DRIVER);
            
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Succes");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return con;
    }
    public static void main(String[] args) {
        connectDB();
    }
}
