/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class saveNoteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String Title = request.getParameter("Title");
        String Content = request.getParameter("Content");
        saveDetails sd = new saveDetails(Title, Content);

        UserDao dao = new UserDao(DbConnect.getConnect());
        boolean f = dao.saveNote(sd);
        HttpSession session;
        PrintWriter out = response.getWriter();

        if (f) {
            session = request.getSession();
            session.setAttribute("save-sucess", "saving successfully");
            
            response.sendRedirect("Home.jsp");
        } else {
            session = request.getSession();
            session.setAttribute("save-failed", "saving Unsuccessfull");
            response.sendRedirect("Home.jsp");
    
           
        }
    }

}
