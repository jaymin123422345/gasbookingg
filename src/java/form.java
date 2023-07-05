<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jaymi
 */@WebServlet(urlPatterns = {"/form"})
public class form extends HttpServlet {
    Connection con = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                   try{
            PrintWriter out = response.getWriter ();
            HttpSession session = request.getSession(true);
            String cid = (String)session.getValue("cid");
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/gas_booking","root","");
            PreparedStatement ps = con.prepareStatement ("select * from ragistration where c_id=?");
            ps.setString (1, cid);

            ResultSet rs = ps.executeQuery ();
            
            while (rs.next ())
         {
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet booking1</title>");  
            out.println("<link rel=\"stylesheet\" href=\"style1.css\">");
            out.println("</head>");
            out.println("<body>");
             out.println(" <div class='row'>");
            out.println("<div class='col-75'>");
              out.println("<div class='container'>");
               out.println(" <form action='pdf1' method='post'>");

         out.println("<div class='row'>");
         out.println("<div class='col-50'>");
            out.println(" <h3>Billing Address</h3>");
            out.println("<label for='cid'><i class='fa fa-user'></i> ConsumerID</label>");
             out.println("  <input type='number' id='cid' name='cid' value='"+ rs.getString(1) +"'readonly='readonly'>");
             out.println("<label for='fname'><i class='fa fa-user'></i> Full Name</label>");
             out.println("  <input type='text' id='fname' name='firstname' value='"+ rs.getString(2) +"'>");
             out.println("<label for='email'><i class='fa fa-envelope'></i> Email</label>");
             out.println("<input type='text' id='email' name='email' value='"+ rs.getString(3) +"'>");
             out.println("  <label for='mobile'><i class='fa fa-address-card-o'></i> Mobile Number</label>");
             out.println("<input type='number' id='mobile' name='mobile' value='"+ rs.getString(5) +"'>");
             out.println("<label for='adr'><i class='fa fa-institution'></i> Address</label>");
             out.println("<input type='text' id='adr' name='adr' value='"+ rs.getString(6) +"'>"); 
              out.println("<label for='pin'><i class='fa fa-institution'></i> Pin</label>");
             out.println("<input type='number' id='pin' name='pin' value='"+ rs.getString(7) +"'>");
             out.println("<label for='city'><i class='fa fa-institution'></i> City</label>");
             out.println("<input type='text' id='city' name='city' value='"+ rs.getString(8) +"'>");
            

           
             out.println("</div>");
                out.println(" </div>");
                
                out.println(" <div class='col-25'>");
                  out.println(" <div class='container'>");
                    out.println(" <h4>BOOKED CYLINDER");
                    out.println("   <span class='price' style='color:black'>");
                      out.println("   <i class='fa fa-shopping-cart'></i>");
                       out.println("  <b>1</b>");
                      out.println(" </span>");
                   out.println("  </h4>");
                    out.println(" <p><a href='#'>Product 1</a> <span class='price'>1160</span></p>"); 
                   out.println("  <hr>");
                    out.println(" <p>Total <span class='price' style='color:black'><b>1160</b></span></p>");
                   out.println(" <div class='col-50'>");
                 out.println("  <h3>Payment</h3>");
              out.println(" </div>");
             out.println("  <label>");
                out.println(" <input type='checkbox' checked='checked' name='sameadr'> Shipping address same as billing");
              out.println(" </label>");
             out.println("  <input type='submit' value='Generate Reciepe' class='btn'>");

          out.println(" </div>");
                out.println(" </div>");
                out.println(" </form>");
             out.println(" </div>");
               out.println("  </div>");
              out.println(" </div>");
            out.println("</body>");
            out.println("</html>");
         }
        }
        catch (Exception e2)
        {
            e2.printStackTrace ();
        }
        finally
        {
            out.close ();
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
        doGet(request, response);
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jaymi
 */@WebServlet(urlPatterns = {"/form"})
public class form extends HttpServlet {
    Connection con = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
                   try{
            PrintWriter out = response.getWriter ();
            HttpSession session = request.getSession(true);
            String cid = (String)session.getValue("cid");
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/gas_booking","root","");
            PreparedStatement ps = con.prepareStatement ("select * from ragistration where c_id=?");
            ps.setString (1, cid);

            ResultSet rs = ps.executeQuery ();
            
            while (rs.next ())
         {
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet booking1</title>");  
            out.println("<link rel=\"stylesheet\" href=\"style1.css\">");
            out.println("</head>");
            out.println("<body>");
             out.println(" <div class='row'>");
            out.println("<div class='col-75'>");
              out.println("<div class='container'>");
               out.println(" <form action='pdf1' method='post'>");

         out.println("<div class='row'>");
         out.println("<div class='col-50'>");
            out.println(" <h3>Billing Address</h3>");
            out.println("<label for='cid'><i class='fa fa-user'></i> ConsumerID</label>");
             out.println("  <input type='number' id='cid' name='cid' value='"+ rs.getString(1) +"'readonly='readonly'>");
             out.println("<label for='fname'><i class='fa fa-user'></i> Full Name</label>");
             out.println("  <input type='text' id='fname' name='firstname' value='"+ rs.getString(2) +"'>");
             out.println("<label for='email'><i class='fa fa-envelope'></i> Email</label>");
             out.println("<input type='text' id='email' name='email' value='"+ rs.getString(3) +"'>");
             out.println("  <label for='mobile'><i class='fa fa-address-card-o'></i> Mobile Number</label>");
             out.println("<input type='number' id='mobile' name='mobile' value='"+ rs.getString(5) +"'>");
             out.println("<label for='adr'><i class='fa fa-institution'></i> Address</label>");
             out.println("<input type='text' id='adr' name='adr' value='"+ rs.getString(6) +"'>"); 
              out.println("<label for='pin'><i class='fa fa-institution'></i> Pin</label>");
             out.println("<input type='number' id='pin' name='pin' value='"+ rs.getString(7) +"'>");
             out.println("<label for='city'><i class='fa fa-institution'></i> City</label>");
             out.println("<input type='text' id='city' name='city' value='"+ rs.getString(8) +"'>");
            

           
             out.println("</div>");
                out.println(" </div>");
                
                out.println(" <div class='col-25'>");
                  out.println(" <div class='container'>");
                    out.println(" <h4>BOOKED CYLINDER");
                    out.println("   <span class='price' style='color:black'>");
                      out.println("   <i class='fa fa-shopping-cart'></i>");
                       out.println("  <b>1</b>");
                      out.println(" </span>");
                   out.println("  </h4>");
                    out.println(" <p><a href='#'>Product 1</a> <span class='price'>1160</span></p>"); 
                   out.println("  <hr>");
                    out.println(" <p>Total <span class='price' style='color:black'><b>1160</b></span></p>");
                   out.println(" <div class='col-50'>");
                 out.println("  <h3>Payment</h3>");
              out.println(" </div>");
             out.println("  <label>");
                out.println(" <input type='checkbox' checked='checked' name='sameadr'> Shipping address same as billing");
              out.println(" </label>");
             out.println("  <input type='submit' value='Generate Reciepe' class='btn'>");

          out.println(" </div>");
                out.println(" </div>");
                out.println(" </form>");
             out.println(" </div>");
               out.println("  </div>");
              out.println(" </div>");
            out.println("</body>");
            out.println("</html>");
         }
        }
        catch (Exception e2)
        {
            e2.printStackTrace ();
        }
        finally
        {
            out.close ();
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
        doGet(request, response);
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
