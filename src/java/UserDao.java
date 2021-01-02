/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Triloknath Nalawade
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        super();
        this.con = con;

    }

    public boolean addUser(UserDetails ud) {
        boolean f = false;
        try {
            String query = "insert into UserDetails (Fname, Lname, Email, Password) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ud.getFname());
            ps.setString(2, ud.getLname());
            ps.setString(3, ud.getEmail());
            ps.setString(4, ud.getPassword());

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public boolean userLogin(UserDetails ud) {
        boolean f = false;
        try {
            String query = " select * from UserDetails where Email=? and Password=?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ud.getEmail());
            ps.setString(2, ud.getPassword());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                f=true;
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
