<html>    
<head>    
<meta name="viewport" content="width=device-width, initial-scale=1">    
<style>    
* {    
  box-sizing: border-box;    
}    
    
input[type=text], select, textarea {    
  width: 100%;    
  padding: 12px;    
  border: 1px solid rgb(70, 68, 68);    
  border-radius: 4px;    
  resize: vertical;    
}    
input[type=email], select, textarea {    
  width: 100%;    
  padding: 12px;    
  border: 1px solid rgb(70, 68, 68);    
  border-radius: 4px;    
  resize: vertical;    
}    
    
label {    
  padding: 12px 12px 12px 0;    
  display: inline-block;    
}    
    
input[type=submit] {    
  background-color: rgb(37, 116, 161);    
  color: white;    
  padding: 12px 20px;    
  border: none;    
  border-radius: 4px;    
  cursor: pointer;    
  float: right;    
}    
    
input[type=submit]:hover {    
  background-color: #45a049;    
}    
    
.container {    
  border-radius: 5px;    
  background-color: #f2f2f2;    
  padding: 20px;    
}    
    
.col-25 {    
  float: left;    
  width: 25%;    
  margin-top: 6px;    
}    
    
.col-75 {    
  float: left;    
  width: 75%;    
  margin-top: 6px;    
}    
    
/* Clear floats after the columns */    
.row:after {    
  content: "";    
  display: table;    
  clear: both;  
  
}    
  .low{
      background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 2px 1400px;
  transition-duration: 0.4s;
  cursor: pointer;
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
  }  
  .low:hover {
  background-color: #4CAF50;
  color: white;
}
/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */    
</style>    
</head>    
<body>    
    <h2>FEED BACK FORM <button onclick="window.location.href='logout.html'" class="low">Go to Home</button></h2>    
    
<%
            String cid = (String)session.getValue("cid");
             String pid = (String)session.getValue("pid");
              String number = (String)session.getValue("number");
               String email = (String)session.getValue("email");
                String firstname = (String)session.getValue("firstname");
%>
<div class="container">    
    <form action="feedback" method="post">    
    <div class="row">    
      <div class="col-25">    
        <label for="fname">First Name</label>    
      </div>    
      <div class="col-75">    
          <input type="text" id="fname" name="firstname" placeholder=<%out.println(firstname);%> readonly>    
      </div>    
    </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="email">Email</label>    
      </div>    
      <div class="col-75">    
        <input type="email" id="email" name="email" placeholder=<%out.println(email);%>readonly>    
      </div>    
    </div>    
    <div class="row">    
        <div class="col-25">    
          <label for="number">Mobile Number</label>    
        </div>    
        <div class="col-75">    
          <input type="number" id="number" name="number" placeholder=<%out.println(number);%>readonly>    
        </div>    
      </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="cid">Consumer ID</label>    
      </div>    
     <div class="col-75">    
          <input type="number" id="cid" name="cid" placeholder=<%out.println(cid);%>readonly>    
        </div>    
    </div>    
         <div class="row">    
      <div class="col-25">    
        <label for="pid">Product ID</label>    
      </div>    
     <div class="col-75">    
          <input type="number" id="pid" name="pid" placeholder=<%out.println(pid);%>readonly>    
        </div>    
    </div>    
    <div class="row">    
      <div class="col-25">    
        <label for="feed_back">Feed Back</label>    
      </div>    
      <div class="col-75">    
          <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px" required="required"></textarea>    
      </div>    
    </div>    
    <div class="row">    
      <input type="submit" value="Submit">    
       
    </div>    
        
  </form>    
</div>    
    
</body>    
</html>    