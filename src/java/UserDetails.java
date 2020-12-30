
/**
 *
 * @author Triloknath Nalawade
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDetails {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/ENotes";
    static final String USER = "root";
    static final String PASS = "root";
    Connection conn = null;
    Statement stmt = null;
    String sql;

    void ConnectionFun() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("// Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            System.out.println("Database Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
