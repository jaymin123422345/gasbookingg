<<<<<<< HEAD
import com.mysql.cj.Session;
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;
  
  @WebServlet(urlPatterns = {"/checkj"})
public class checkj extends HttpServlet {  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException { 
    response.setContentType("text/html;charset=UTF-8");
    try(PrintWriter out = response.getWriter()){
    String n=request.getParameter("c_id");  
    String p=request.getParameter("password");  
                    if(check2.validate(n, p))  {
                        HttpSession session = request.getSession(true);
                        session.putValue("cid", n);
                        response.sendRedirect(request.getContextPath()+ "/form"); 
                    }
                    else{
                              response.sendRedirect("booking.html"); 
                         }
    out.close();  
    }  
}
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
=======
import com.mysql.cj.Session;
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;
  
  @WebServlet(urlPatterns = {"/checkj"})
public class checkj extends HttpServlet {  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException { 
    response.setContentType("text/html;charset=UTF-8");
    try(PrintWriter out = response.getWriter()){
    String n=request.getParameter("c_id");  
    String p=request.getParameter("password");  
                    if(check2.validate(n, p))  {
                        HttpSession session = request.getSession(true);
                        session.putValue("cid", n);
                        response.sendRedirect(request.getContextPath()+ "/form"); 
                    }
                    else{
                              response.sendRedirect("booking.html"); 
                         }
    out.close();  
    }  
}
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
>>>>>>> 45c8810cba80b6da50689e16522b3c1a9944a515
