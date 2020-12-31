
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.metamodel.SetAttribute;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Triloknath Nalawade
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String Fname = request.getParameter("Fname");
        String Lname = request.getParameter("Lname");
        String Email = request.getParameter("Email");
        String Password = request.getParameter("Password");

        UserDetails ud = new UserDetails(Fname, Lname, Email, Password);

        UserDao dao = new UserDao(DbConnect.getConnect() );
        boolean f =dao.addUser(ud);
        PrintWriter pout= response.getWriter();
        
        HttpSession session;
        
        if(f)
        {
           
            session= request.getSession();
            session.setAttribute("reg-sucess", "User Registration successfully" );
            response.sendRedirect("Register.jsp");
        } 
        else
        {
            session= request.getSession();
            session.setAttribute("reg-failed", "Unsuccessfully" );
            response.sendRedirect("Register.jsp");
        }
    }

}
