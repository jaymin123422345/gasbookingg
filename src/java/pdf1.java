<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.xdevapi.Table;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.pdf.PdfPTable;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.File;
import java.io.OutputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Cell;
import static javax.management.Query.value;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jaymi
 */
            @WebServlet(urlPatterns = {"/pdf1"})
            public class pdf1 extends HttpServlet {
               private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
                        Font.BOLD);
                private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                        Font.NORMAL, BaseColor.RED);
                private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
                        Font.BOLD);
                private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                        Font.BOLD);
                Connection con = null;
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
        try (PrintWriter out = response.getWriter()) {
              java.util.Random r= new java.util.Random();
             int start = 11111111;
             int end  = 99999999;
             int n = r.nextInt(end-start) + start;
            String result = Integer.toString(n);
              String c_id = request.getParameter("cid");
            String customer_name = request.getParameter("firstname");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            String address = request.getParameter("adr");
            String city = request.getParameter("city");
            String pin = request.getParameter("pin");
                    try{

                     Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");

                     PreparedStatement ts = con.prepareStatement("insert into booking(c_id,p_id,c_name,mobile) values(?,?,?,?)");
                    ts.setString(1, c_id);
                    ts.setString(2, result);
                    ts.setString(3, customer_name);
                    ts.setString(4, mobile);
                    ts.executeUpdate();
                    }
                       catch(Exception e){
                     out.println(e);
                     out.println("Connection not opk..");
                }
           
                            try{
                         Document document = new Document();


                         OutputStream outputStream = 
                                 new FileOutputStream(new File("C:\\Users\\jaymi\\Downloads\\gasbooking.pdf"));

                         PdfWriter.getInstance(document, outputStream);


                         document.open();
                            Paragraph preface = new Paragraph();



                         Anchor anchor = new Anchor("Gas_Booking", catFont);
                         anchor.setName("First Chapter");
                           anchor.add(new Anchor(
                                 "\nReport generated by: Bharat Gas, " + new Date()+"\n\n\n", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                 smallBold));

                         Chapter catPart = new Chapter(new Paragraph(anchor),1);

                         Paragraph subPara = new Paragraph("Costomer Details", subFont);
                         Section subCatPart = catPart.addSection(subPara);
                         subCatPart.add(new Paragraph("Consumer ID===="+c_id));
                         subCatPart.add(new Paragraph("Name===="+customer_name));
                         subCatPart.add(new Paragraph("Email===="+email));
                         subCatPart.add(new Paragraph("MobileNumber===="+mobile));
                         subCatPart.add(new Paragraph("Address===="+address));
                         subCatPart.add(new Paragraph("PIN===="+pin));
                         subCatPart.add(new Paragraph("City===="+city+"\n\n\n\n"));
                         subCatPart.add(new Paragraph("Cylinder           ProductID            Amount",subFont));
                         subCatPart.add(new Paragraph("20KG                      "+result+"                   ₹1150  "));

                         document.add(preface);

                         document.add(catPart);



                          document.close();
                           outputStream.close();
                           
                            }
                              catch(Exception e){
                                          out.println(e);
                              }
                        HttpSession session = request.getSession(true);
                        session.putValue("cid", c_id);
                        session.putValue("pid", result);
                        session.putValue("number", mobile);
                        session.putValue("firstname", customer_name);
                        session.putValue("email", email);
                        
                        response.sendRedirect(request.getContextPath()+ "/feedback.jsp"); 
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
            throws ServletException, IOException{
           doGet(request, response);
       }  /**
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

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.xdevapi.Table;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.pdf.PdfPTable;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.File;
import java.io.OutputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Cell;
import static javax.management.Query.value;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jaymi
 */
            @WebServlet(urlPatterns = {"/pdf1"})
            public class pdf1 extends HttpServlet {
               private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
                        Font.BOLD);
                private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                        Font.NORMAL, BaseColor.RED);
                private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
                        Font.BOLD);
                private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                        Font.BOLD);
                Connection con = null;
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
        try (PrintWriter out = response.getWriter()) {
              java.util.Random r= new java.util.Random();
             int start = 11111111;
             int end  = 99999999;
             int n = r.nextInt(end-start) + start;
            String result = Integer.toString(n);
              String c_id = request.getParameter("cid");
            String customer_name = request.getParameter("firstname");
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            String address = request.getParameter("adr");
            String city = request.getParameter("city");
            String pin = request.getParameter("pin");
                    try{

                     Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");

                     PreparedStatement ts = con.prepareStatement("insert into booking(c_id,p_id,c_name,mobile) values(?,?,?,?)");
                    ts.setString(1, c_id);
                    ts.setString(2, result);
                    ts.setString(3, customer_name);
                    ts.setString(4, mobile);
                    ts.executeUpdate();
                    }
                       catch(Exception e){
                     out.println(e);
                     out.println("Connection not opk..");
                }
           
                            try{
                         Document document = new Document();


                         OutputStream outputStream = 
                                 new FileOutputStream(new File("C:\\Users\\jaymi\\Downloads\\gasbooking.pdf"));

                         PdfWriter.getInstance(document, outputStream);


                         document.open();
                            Paragraph preface = new Paragraph();



                         Anchor anchor = new Anchor("Gas_Booking", catFont);
                         anchor.setName("First Chapter");
                           anchor.add(new Anchor(
                                 "\nReport generated by: Bharat Gas, " + new Date()+"\n\n\n", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                 smallBold));

                         Chapter catPart = new Chapter(new Paragraph(anchor),1);

                         Paragraph subPara = new Paragraph("Costomer Details", subFont);
                         Section subCatPart = catPart.addSection(subPara);
                         subCatPart.add(new Paragraph("Consumer ID===="+c_id));
                         subCatPart.add(new Paragraph("Name===="+customer_name));
                         subCatPart.add(new Paragraph("Email===="+email));
                         subCatPart.add(new Paragraph("MobileNumber===="+mobile));
                         subCatPart.add(new Paragraph("Address===="+address));
                         subCatPart.add(new Paragraph("PIN===="+pin));
                         subCatPart.add(new Paragraph("City===="+city+"\n\n\n\n"));
                         subCatPart.add(new Paragraph("Cylinder           ProductID            Amount",subFont));
                         subCatPart.add(new Paragraph("20KG                      "+result+"                   ₹1150  "));

                         document.add(preface);

                         document.add(catPart);



                          document.close();
                           outputStream.close();
                           
                            }
                              catch(Exception e){
                                          out.println(e);
                              }
                        HttpSession session = request.getSession(true);
                        session.putValue("cid", c_id);
                        session.putValue("pid", result);
                        session.putValue("number", mobile);
                        session.putValue("firstname", customer_name);
                        session.putValue("email", email);
                        
                        response.sendRedirect(request.getContextPath()+ "/feedback.jsp"); 
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
            throws ServletException, IOException{
           doGet(request, response);
       }  /**
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
