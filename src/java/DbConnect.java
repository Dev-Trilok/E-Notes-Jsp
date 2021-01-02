
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Document : Home 
 * Created on : 31 Dec, 2020, 12:05:12 PM 
 * Author : Triloknath Nalawade
 */
public class DbConnect {
  
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ENotes";
    static final String USER = "root";
    static final String PASS = "root";
    static Connection con = null;
    static Statement stmt = null;
    String sql;

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
//            stmt = con.createStatement();
            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
