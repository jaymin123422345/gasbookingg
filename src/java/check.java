<<<<<<< HEAD
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
 @WebServlet(urlPatterns = {"/check"}) 
public class check extends HttpServlet {  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException { 
    response.setContentType("text/html;charset=UTF-8");
    try(PrintWriter out = response.getWriter()){
    String n=request.getParameter("c_id");  
    String p=request.getParameter("password");  
                    if(check1.validate(n, p))  {
                        response.sendRedirect("admin.html"); 
                    }
                    else{
                                if(check2.validate(n, p)){  
                                        response.sendRedirect("logout.html");  

                                }  
                                else{  
                                    response.sendRedirect("Login.html");  
                                }  
                         }
    out.close();  
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
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
 @WebServlet(urlPatterns = {"/check"}) 
public class check extends HttpServlet {  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException { 
    response.setContentType("text/html;charset=UTF-8");
    try(PrintWriter out = response.getWriter()){
    String n=request.getParameter("c_id");  
    String p=request.getParameter("password");  
                    if(check1.validate(n, p))  {
                        response.sendRedirect("admin.html"); 
                    }
                    else{
                                if(check2.validate(n, p)){  
                                        response.sendRedirect("logout.html");  

                                }  
                                else{  
                                    response.sendRedirect("Login.html");  
                                }  
                         }
    out.close();  
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
