<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            try{
              response.setContentType("text/html");
             PrintWriter out = response.getWriter();   
            String nm = request.getParameter("number");
          java.util.Random r= new java.util.Random();
             int start = 111111;
               int end  = 999999;
              int result = r.nextInt(end-start) + start;
                    
            
             String apiKey = "apikey=" + "NjMzNDMyMzk0ODM3NjM0NTYxNjQ2ZTc2NDY0ZDZhNzM=";
            String message ="&message=" + "Hi there, thank you for sending your first test message from Textlocal. Get 20% off today with our code: "+result+".";
            String sender = "&sender=" + "600010";
            String numbers = "&numbers=" + nm;
             HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender ;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
             String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line).append("\n");
                }
            System.out.println(stringBuffer.toString());
            rd.close();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Your Consumer Number Send in to Your MobileNumber</h1>");
            out.println("<li>");
            out.println("<a href=\"cid.html\">");
            out.println("<button>Go back Your page </button>");
            out.println("</a>");
            out.println("</li>");
            out.println("</body>");
            out.println("</html>");
 
 
        } catch (Exception e) {
           e.printStackTrace();
        }
   
     }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**Servlet at " kn "</h1>");
            out.println("</body>");
            out.println("</html>");
 
 
        } catch (Exception e) {
           e.printStackTrace();
        }
   
     }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param req
     * @param resp
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            try{
              response.setContentType("text/html");
             PrintWriter out = response.getWriter();   
            String nm = request.getParameter("number");
          java.util.Random r= new java.util.Random();
             int start = 111111;
               int end  = 999999;
              int result = r.nextInt(end-start) + start;
                    
            
             String apiKey = "apikey=" + "NjMzNDMyMzk0ODM3NjM0NTYxNjQ2ZTc2NDY0ZDZhNzM=";
            String message ="&message=" + "Hi there, thank you for sending your first test message from Textlocal. Get 20% off today with our code: "+result+".";
            String sender = "&sender=" + "600010";
            String numbers = "&numbers=" + nm;
             HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
            String data = apiKey + numbers + message + sender ;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
             String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line).append("\n");
                }
            System.out.println(stringBuffer.toString());
            rd.close();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Your Consumer Number Send in to Your MobileNumber</h1>");
            out.println("<li>");
            out.println("<a href=\"cid.html\">");
            out.println("<button>Go back Your page </button>");
            out.println("</a>");
            out.println("</li>");
            out.println("</body>");
            out.println("</html>");
 
 
        } catch (Exception e) {
           e.printStackTrace();
        }
   
     }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**Servlet at " kn "</h1>");
            out.println("</body>");
            out.println("</html>");
 
 
        } catch (Exception e) {
           e.printStackTrace();
        }
   
     }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param req
     * @param resp
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     *

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        doGet(request, response);
    }
}
>>>>>>> 45c8810cba80b6da50689e16522b3c1a9944a515
