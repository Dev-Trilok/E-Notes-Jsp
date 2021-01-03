
/**
 *
 * @author Triloknath Nalawade
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDetails {

    private String Fname, Lname, Email, Password;

    public UserDetails() {
        super();
    }

    public UserDetails(String Fname, String Lname, String Email, String Password) {
        super();
        this.Fname = Fname; 
        this.Lname = Lname;
        this.Email = Email;
        this.Password = Password;
        
        

    }
    
    

    public String getLname() {
        return Lname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getFname() {
        return Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    

}
