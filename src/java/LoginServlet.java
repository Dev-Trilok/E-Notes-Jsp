
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Triloknath Nalawade
 */
//@webServlet("/LoginServlet");

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Login success");

        String Email = request.getParameter("Email");
        String Password = request.getParameter("Password");
        UserDetails ud = new UserDetails();
        ud.setEmail(Email);
        ud.setPassword(Password);

        UserDao dao = new UserDao(DbConnect.getConnect());
        boolean f = dao.userLogin(ud);

        HttpSession session;

        if (f) {
            session = request.getSession();
            response.sendRedirect("Home.jsp");
        } else 
        {
            session = request.getSession();
            session.setAttribute("login-failed", "Invalid Email and Password");
            response.sendRedirect("Login.jsp");

        }

    }

}
