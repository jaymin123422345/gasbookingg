<<<<<<< HEAD

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaymi
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    Connection con = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {     
            try{
            String c_id = request.getParameter("c_id");
            String customer_name = request.getParameter("customer_name");
            String mobile = request.getParameter("mobile");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String pin = request.getParameter("pin");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");
            PreparedStatement st = con.prepareStatement("insert into ragistration (c_id,customer_name,email,password,mobile,address,pin,city) values (?,?,?,?,?,?,?,?)");
            st.setString(1, c_id);
            st.setString(2, customer_name);
            st.setString(3, email);
            st.setString(4, password);
            st.setString(5, mobile);
            st.setString(6, address);
            st.setString(7, pin);
            st.setString(8, city);
            st.executeUpdate();
          // response.sendRedirect("logout.html");
            response.sendRedirect("logout.html");
         }
        
         catch(Exception e){
             out.println(e);
             out.println("Connection not opk..");
              Statement stmt = con.createStatement();
         }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
=======

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaymi
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

    Connection con = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {     
            try{
            String c_id = request.getParameter("c_id");
            String customer_name = request.getParameter("customer_name");
            String mobile = request.getParameter("mobile");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String pin = request.getParameter("pin");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");
            PreparedStatement st = con.prepareStatement("insert into ragistration (c_id,customer_name,email,password,mobile,address,pin,city) values (?,?,?,?,?,?,?,?)");
            st.setString(1, c_id);
            st.setString(2, customer_name);
            st.setString(3, email);
            st.setString(4, password);
            st.setString(5, mobile);
            st.setString(6, address);
            st.setString(7, pin);
            st.setString(8, city);
            st.executeUpdate();
          // response.sendRedirect("logout.html");
            response.sendRedirect("logout.html");
         }
        
         catch(Exception e){
             out.println(e);
             out.println("Connection not opk..");
              Statement stmt = con.createStatement();
         }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> 45c8810cba80b6da50689e16522b3c1a9944a515
