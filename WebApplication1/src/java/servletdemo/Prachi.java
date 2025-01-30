package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Prachi", urlPatterns = {"/Prachi"})
public class Prachi extends HttpServlet {
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            if(!con.isClosed()){
                try (PrintWriter out = response.getWriter()) {
                    String action = request.getParameter("action");
                    if(action != null && action.equals("forget_password")) {
                        String username = request.getParameter("username");
                        try {
                            PreparedStatement preparedStatement = con.prepareStatement("SELECT password FROM users WHERE username=?");
                            preparedStatement.setString(1, username);
                            ResultSet resultSet = preparedStatement.executeQuery();
                            if(resultSet.next()) {
                                out.println("<p> Enter new Password </p>");
                                out.println("<form action='Update' method='post'>");
                                out.println("<input type='password' name='newpassword'>");
                                out.println("<input type='hidden' name='username' value='username'/>");
                                out.println("<input type='submit' name='Update Password'>");
                                out.println("</form>");
                            } else {
                                out.println("<p>User not found</p>");
                            }
                        }
                        catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                    
                    else if(action != null && action.equals("delete_user")) {
                        String username = request.getParameter("username");
                        String password = request.getParameter("password");
                        try {
                            PreparedStatement preparedStatement = con.prepareStatement("DELETE FROM users WHERE username=? AND password=?");
                            preparedStatement.setString(1, username);
                            preparedStatement.setString(2, password);
                   
                            int rowsAffected = preparedStatement.executeUpdate();
                            if(rowsAffected > 0) {
                                out.println("<p>Deleted successfully</p>");
                            } else {
                                out.println("<p>User doesn't exist or password incorrect</p>");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                    
                    else {
                        String username = request.getParameter("username");
                        String password = request.getParameter("password");

                        try {
                            PreparedStatement preparedStatement = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
                            preparedStatement.setString(1, username);
                            preparedStatement.setString(2, password);

                            ResultSet resultSet = preparedStatement.executeQuery();

                            if (resultSet.next()) {
                                out.println("<p>Success</p>");
                            } else {
                                out.println("<p>Failure!</p>");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        } catch(SQLException ex) {
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
    public String getServletInfo() {
        return "Short description";
    }
}