<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaymi
 */
@WebServlet(urlPatterns = {"/adminorder"})
public class adminorder extends HttpServlet {
    Connection con = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           try {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");

            PreparedStatement ps=con.prepareStatement("select * from booking");  
             ResultSet rs = ps.executeQuery ();
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<style> table,th,td{border:1px solid black;}</style>");
            
            out.println("<body>");
            out.println("<table style='width:35%'>");
            out.println("<tr align='left'>");
            out.println("<th> Consumer ID </th>");
             out.println("<th> Product ID </th>");
              out.println("<th> Customer Name </th>");
             out.println("<th> Mobile </th>");
              out.println("<tr>");
              
             while (rs.next())
                 {
             String cid =rs.getString("c_id");
             String pid =rs.getString("p_id");
             String cname =rs.getString("c_name");
             String mobile =rs.getString("mobile");
              out.println("<tr>");
              out.println("<td>"+cid+"</td>");
              out.println("<td>"+pid+"</td>");
              out.println("<td>"+cname+"</td>");
              out.println("<td>"+mobile+"</td>");
              
               out.println("<tr>");
           
                 }
             out.println("</table>");
             out.println("<form action='adminorder1'>");
              out.println("<label for='pid'>ProductID</label>");
             out.println("  <input type='number' id='pid' name='pid' value='ProductID' >");
             out.println("  <input type='submit' value='Delete Data'>");
              out.println("</form>");          
               out.println("</body>");
            out.println("</html>");
             ps.close();
        }
            catch (Exception e) {
           e.printStackTrace();
        }
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaymi
 */
@WebServlet(urlPatterns = {"/adminorder"})
public class adminorder extends HttpServlet {
    Connection con = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           try {
             Class.forName("com.mysql.cj.jdbc.Driver");  
             
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");

            PreparedStatement ps=con.prepareStatement("select * from booking");  
             ResultSet rs = ps.executeQuery ();
              out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<style> table,th,td{border:1px solid black;}</style>");
            
            out.println("<body>");
            out.println("<table style='width:35%'>");
            out.println("<tr align='left'>");
            out.println("<th> Consumer ID </th>");
             out.println("<th> Product ID </th>");
              out.println("<th> Customer Name </th>");
             out.println("<th> Mobile </th>");
              out.println("<tr>");
              
             while (rs.next())
                 {
             String cid =rs.getString("c_id");
             String pid =rs.getString("p_id");
             String cname =rs.getString("c_name");
             String mobile =rs.getString("mobile");
              out.println("<tr>");
              out.println("<td>"+cid+"</td>");
              out.println("<td>"+pid+"</td>");
              out.println("<td>"+cname+"</td>");
              out.println("<td>"+mobile+"</td>");
              
               out.println("<tr>");
           
                 }
             out.println("</table>");
             out.println("<form action='adminorder1'>");
              out.println("<label for='pid'>ProductID</label>");
             out.println("  <input type='number' id='pid' name='pid' value='ProductID' >");
             out.println("  <input type='submit' value='Delete Data'>");
              out.println("</form>");          
               out.println("</body>");
            out.println("</html>");
             ps.close();
        }
            catch (Exception e) {
           e.printStackTrace();
        }
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
