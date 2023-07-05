<<<<<<< HEAD
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>    \n");
      out.write("<head>    \n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("<style>    \n");
      out.write("* {    \n");
      out.write("  box-sizing: border-box;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("input[type=text], select, textarea {    \n");
      out.write("  width: 100%;    \n");
      out.write("  padding: 12px;    \n");
      out.write("  border: 1px solid rgb(70, 68, 68);    \n");
      out.write("  border-radius: 4px;    \n");
      out.write("  resize: vertical;    \n");
      out.write("}    \n");
      out.write("input[type=email], select, textarea {    \n");
      out.write("  width: 100%;    \n");
      out.write("  padding: 12px;    \n");
      out.write("  border: 1px solid rgb(70, 68, 68);    \n");
      out.write("  border-radius: 4px;    \n");
      out.write("  resize: vertical;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("label {    \n");
      out.write("  padding: 12px 12px 12px 0;    \n");
      out.write("  display: inline-block;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("input[type=submit] {    \n");
      out.write("  background-color: rgb(37, 116, 161);    \n");
      out.write("  color: white;    \n");
      out.write("  padding: 12px 20px;    \n");
      out.write("  border: none;    \n");
      out.write("  border-radius: 4px;    \n");
      out.write("  cursor: pointer;    \n");
      out.write("  float: right;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("input[type=submit]:hover {    \n");
      out.write("  background-color: #45a049;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write(".container {    \n");
      out.write("  border-radius: 5px;    \n");
      out.write("  background-color: #f2f2f2;    \n");
      out.write("  padding: 20px;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write(".col-25 {    \n");
      out.write("  float: left;    \n");
      out.write("  width: 25%;    \n");
      out.write("  margin-top: 6px;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write(".col-75 {    \n");
      out.write("  float: left;    \n");
      out.write("  width: 75%;    \n");
      out.write("  margin-top: 6px;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("/* Clear floats after the columns */    \n");
      out.write(".row:after {    \n");
      out.write("  content: \"\";    \n");
      out.write("  display: table;    \n");
      out.write("  clear: both;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */    \n");
      out.write("</style>    \n");
      out.write("</head>    \n");
      out.write("<body>    \n");
      out.write("<h2>FEED BACK FORM</h2>    \n");
=======
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>    \n");
      out.write("<head>    \n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("<style>    \n");
      out.write("* {    \n");
      out.write("  box-sizing: border-box;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("input[type=text], select, textarea {    \n");
      out.write("  width: 100%;    \n");
      out.write("  padding: 12px;    \n");
      out.write("  border: 1px solid rgb(70, 68, 68);    \n");
      out.write("  border-radius: 4px;    \n");
      out.write("  resize: vertical;    \n");
      out.write("}    \n");
      out.write("input[type=email], select, textarea {    \n");
      out.write("  width: 100%;    \n");
      out.write("  padding: 12px;    \n");
      out.write("  border: 1px solid rgb(70, 68, 68);    \n");
      out.write("  border-radius: 4px;    \n");
      out.write("  resize: vertical;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("label {    \n");
      out.write("  padding: 12px 12px 12px 0;    \n");
      out.write("  display: inline-block;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("input[type=submit] {    \n");
      out.write("  background-color: rgb(37, 116, 161);    \n");
      out.write("  color: white;    \n");
      out.write("  padding: 12px 20px;    \n");
      out.write("  border: none;    \n");
      out.write("  border-radius: 4px;    \n");
      out.write("  cursor: pointer;    \n");
      out.write("  float: right;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("input[type=submit]:hover {    \n");
      out.write("  background-color: #45a049;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write(".container {    \n");
      out.write("  border-radius: 5px;    \n");
      out.write("  background-color: #f2f2f2;    \n");
      out.write("  padding: 20px;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write(".col-25 {    \n");
      out.write("  float: left;    \n");
      out.write("  width: 25%;    \n");
      out.write("  margin-top: 6px;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write(".col-75 {    \n");
      out.write("  float: left;    \n");
      out.write("  width: 75%;    \n");
      out.write("  margin-top: 6px;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("/* Clear floats after the columns */    \n");
      out.write(".row:after {    \n");
      out.write("  content: \"\";    \n");
      out.write("  display: table;    \n");
      out.write("  clear: both;    \n");
      out.write("}    \n");
      out.write("    \n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */    \n");
      out.write("</style>    \n");
      out.write("</head>    \n");
      out.write("<body>    \n");
      out.write("<h2>FEED BACK FORM</h2>    \n");
>>>>>>> 45c8810cba80b6da50689e16522b3c1a9944a515

            String cid = (String)session.getValue("cid");
             String pid = (String)session.getValue("pid");
              String number = (String)session.getValue("number");
               String email = (String)session.getValue("email");
                String firstname = (String)session.getValue("firstname");
<<<<<<< HEAD

      out.write("\n");
      out.write("<div class=\"container\">    \n");
      out.write("  <form>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"fname\">First Name</label>    \n");
      out.write("      </div>    \n");
      out.write("      <div class=\"col-75\">    \n");
      out.write("          <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=");
out.println(firstname);
      out.write(" raedonly>    \n");
      out.write("      </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"email\">Email</label>    \n");
      out.write("      </div>    \n");
      out.write("      <div class=\"col-75\">    \n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" placeholder=");
out.println(email);
      out.write("raedonly>    \n");
      out.write("      </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("        <div class=\"col-25\">    \n");
      out.write("          <label for=\"number\">Mobile Number</label>    \n");
      out.write("        </div>    \n");
      out.write("        <div class=\"col-75\">    \n");
      out.write("          <input type=\"number\" id=\"number\" name=\"number\" placeholder=");
out.println(number);
      out.write("raedonly>    \n");
      out.write("        </div>    \n");
      out.write("      </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"cid\">Consumer ID</label>    \n");
      out.write("      </div>    \n");
      out.write("     <div class=\"col-75\">    \n");
      out.write("          <input type=\"number\" id=\"cid\" name=\"cid\" placeholder=");
out.println(cid);
      out.write("raedonly>    \n");
      out.write("        </div>    \n");
      out.write("    </div>    \n");
      out.write("         <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"pid\">Product ID</label>    \n");
      out.write("      </div>    \n");
      out.write("     <div class=\"col-75\">    \n");
      out.write("          <input type=\"number\" id=\"pid\" name=\"pid\" placeholder=");
out.println(pid);
      out.write("raedonly>    \n");
      out.write("        </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"feed_back\">Feed Back</label>    \n");
      out.write("      </div>    \n");
      out.write("      <div class=\"col-75\">    \n");
      out.write("        <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>    \n");
      out.write("      </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <input type=\"submit\" value=\"Submit\">    \n");
      out.write("    </div>    \n");
      out.write("  </form>    \n");
      out.write("</div>    \n");
      out.write("    \n");
      out.write("</body>    \n");
      out.write("</html>    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
=======

      out.write("\n");
      out.write("<div class=\"container\">    \n");
      out.write("  <form>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"fname\">First Name</label>    \n");
      out.write("      </div>    \n");
      out.write("      <div class=\"col-75\">    \n");
      out.write("          <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=");
out.println(firstname);
      out.write(" raedonly>    \n");
      out.write("      </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"email\">Email</label>    \n");
      out.write("      </div>    \n");
      out.write("      <div class=\"col-75\">    \n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" placeholder=");
out.println(email);
      out.write("raedonly>    \n");
      out.write("      </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("        <div class=\"col-25\">    \n");
      out.write("          <label for=\"number\">Mobile Number</label>    \n");
      out.write("        </div>    \n");
      out.write("        <div class=\"col-75\">    \n");
      out.write("          <input type=\"number\" id=\"number\" name=\"number\" placeholder=");
out.println(number);
      out.write("raedonly>    \n");
      out.write("        </div>    \n");
      out.write("      </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"cid\">Consumer ID</label>    \n");
      out.write("      </div>    \n");
      out.write("     <div class=\"col-75\">    \n");
      out.write("          <input type=\"number\" id=\"cid\" name=\"cid\" placeholder=");
out.println(cid);
      out.write("raedonly>    \n");
      out.write("        </div>    \n");
      out.write("    </div>    \n");
      out.write("         <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"pid\">Product ID</label>    \n");
      out.write("      </div>    \n");
      out.write("     <div class=\"col-75\">    \n");
      out.write("          <input type=\"number\" id=\"pid\" name=\"pid\" placeholder=");
out.println(pid);
      out.write("raedonly>    \n");
      out.write("        </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <div class=\"col-25\">    \n");
      out.write("        <label for=\"feed_back\">Feed Back</label>    \n");
      out.write("      </div>    \n");
      out.write("      <div class=\"col-75\">    \n");
      out.write("        <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>    \n");
      out.write("      </div>    \n");
      out.write("    </div>    \n");
      out.write("    <div class=\"row\">    \n");
      out.write("      <input type=\"submit\" value=\"Submit\">    \n");
      out.write("    </div>    \n");
      out.write("  </form>    \n");
      out.write("</div>    \n");
      out.write("    \n");
      out.write("</body>    \n");
      out.write("</html>    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
>>>>>>> 45c8810cba80b6da50689e16522b3c1a9944a515
