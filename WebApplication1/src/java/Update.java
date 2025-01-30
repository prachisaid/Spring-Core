/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author harsh
 */
@WebServlet(urlPatterns = {"/Update"})
public class Update extends HttpServlet {
    private static final String url = "jdbc:mysql://localhost:3306/practice";
    private static final String user = "root";
    private static final String pass = "password";
    private Connection con;
    private ResultSet rs;
    
    @Override
    public void init() throws ServletException {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           System.out.println("Connected");
        }
        catch(ClassNotFoundException | SQLException ex) {
            System.out.println("Not Connected");
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            if(!con.isClosed()) {
                try (PrintWriter out = response.getWriter()) {
                    String username = request.getParameter("username");
                    String newpass = request.getParameter("newpassword");
                    
                    PreparedStatement preparedStatement = con.prepareStatement("UPDATE users SET password=? WHERE username=?");
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, newpass);
                    preparedStatement.executeQuery();
            
                    out.println("Updated");
                }
            }
        }
        catch(SQLException ex) {
            try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Pratiksha</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Servlet Not connected at " + request.getContextPath() + "</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }
        }
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
