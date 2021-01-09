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

    public UserDetails userLogin(UserDetails ud) {
        UserDetails user = null;
    
        try {
            String query = " select * from UserDetails where Email=? and Password=?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ud.getEmail());
            ps.setString(2, ud.getPassword());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new UserDetails();
                user.setFname(rs.getString("Fname"));
                user.setLname(rs.getString("Lname"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));

            }
            String query2 = "SELECT Id FROM UserDetails WHERE UserDetails.Email =?;";
            ps = con.prepareStatement(query2);
            ps.setString(1, ud.getEmail());
            rs = ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return user;
    }

    public boolean saveNote(saveDetails ud) {
        boolean f = false;
        try {
            String query = " insert into Notes (Title, Content) values (?,?) ;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ud.getTitle());
            ps.setString(2, ud.getContent());
            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
