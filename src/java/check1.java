<<<<<<< HEAD
import java.sql.*;  
  
public class check1 {  
public static boolean validate(String c_id,String password){  
boolean status=false;  
Connection con = null; 
try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");

            PreparedStatement ps=con.prepareStatement("select * from admin where c_id=? and password=?");  
            ps.setString(1,c_id);  
            ps.setString(2,password);  

            ResultSet rs=ps.executeQuery();  
            status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  
=======
import java.sql.*;  
  
public class check1 {  
public static boolean validate(String c_id,String password){  
boolean status=false;  
Connection con = null; 
try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gas_booking","root","");

            PreparedStatement ps=con.prepareStatement("select * from admin where c_id=? and password=?");  
            ps.setString(1,c_id);  
            ps.setString(2,password);  

            ResultSet rs=ps.executeQuery();  
            status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  
>>>>>>> 45c8810cba80b6da50689e16522b3c1a9944a515
