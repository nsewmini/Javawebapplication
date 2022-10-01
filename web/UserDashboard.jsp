<%-- 
    Document   : UserDashboard
    Created on : 30-Sep-2022, 12:12:18
    Author     : Navod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import  = "javax.servlet.http.Cookie"%>
 <%@page import  = "java.io.PrintWriter"%>
 <%@page import="typepac.databaseconnection"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>user dashboard</title>
 
<!-- swiper css link  -->
   <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

   <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

   <!-- Bootstrap -->
   <link type="text/css" rel="stylesheet" href="./Cssfolder/css/bootstrap.min.css" />


   <!-- custom css file link  -->
   <link rel="stylesheet" href="./Cssfolder/userdashboardstyle.css">

       
    </head>
    <body>
         <!--------header section- here ------>
    <!---------------------- start point of the header section  ---------------------->
    <section class="header">
 
        <div class="logo">
      <a>  <img src="./imagefolder/logo01.jpeg" style="height: 89px; width: 150px; transition: .5s;"></a>
     </div>
       
          <nav class="navbar">
            <a href="#"  class="active01">Home</a> 
              <a href="#">Book a flight</a>
              <a href="#">Flight Status</a>
              <a href="#">Profile</a>
               <a href="#" class="signout-btn" style="color: rgb(205, 100, 100);">Sign Out</a>
       
        </nav>
     
        <div id="sidebar" class="fas fa-bars">
<style>
          #sidebar{
            font-size: 2.5rem;
            cursor: pointer;
            color:var(--black);
            display: none;
            float:right;
         }</style>
        </div>
     
     </section>
      
        
      <!-----------end of the header--------->
      
      
      
      
 
       <!---------dashboard body part start from here-------------->
        
         <section id="dashboard">
            <div class="info01">
             <center> <h1 class="info02">   <b>Phoenix-Airline </b></h1></center>
                <center><h2 class="info03"> User Dashboard </h2></center>
                
                <style> 
                 .info01 {
                 
                  
                    position: relative;
                    animation-name: mymove;
                    animation-duration: 5s;
                   
                    text-shadow: 2px 2px 8px #697fc7;
                  }
                  
                  @keyframes mymove {
                    from {right: -5px;}
                    to {right:450px;}
                  }
                  </style>
         </div>
         </section>
     <!----------------sidfebar here---------------->
         <div class="bar01">
            <div class="bar02">
              <div class="bar03">Manage  your ticket booking information</div>
              <br/> <br/> <br/>
              <div class="bar04">
                Account Settings</div>
                <br> <br> <br>
              <div class="bar04">
               Contact us</div>
            </div>
             
             
    <!-----------------the manage your tickect information description is here ---------->
            <div class="manageinfo" >
              <div class="description">
                <br>
               <center><h3><b>Manage  your ticket booking information</b></h3></center>
               <hr />
                   <center> <p>
                        Make it easier and more efficient to manage your ticket booking 
                        information with Phoenix Airlines.
                       <br> 
                    Additionally, update details and track relevant travel times
                     </p>
                   </center>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
        <center>
                <table class="tableinfo">
                    <thead>
                       <tr>
                           
                         <th>Ticket ID</th>
                         <th>Flight ID</th>
                         <th>User Name</th>
                         
                       </tr>
                     </thead>
                     <tbody>
                    
                         
                       <!--------jsp code here---------> 
                         <%
              
                
                    
      List<typepac.Ticketinfogeneratebean> list=typepac.databaseconnection.getAllreservedetails(uname);  
      for(typepac.Ticketinfogeneratebean e:list){  
      out.print("<tr><td>"+"&nbsp "+e.getTicketid()+"</td><td>"+"&nbsp"+e.getFlightid()+"</td><td>"+"&nbsp "+e.getUname()+"</td>  </tr>");  
      }  
                  
        %>
                     </tbody>
                   </table>
                   </center>
        
           </div>
                     <!---------the account setting part here--------> 
             <div class="accountinfo">
                 <center> <h3>Account Settings</h3></center>
                 <hr/>
 <%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
          
      
                   <br>
                   <div class="container rounded bg-white mt-5">
                    <div class="row">
                    <div class="col-md-4 border-right">
                     <div class="d-flex flex-column align-items-center text-center p-3 py-5">
                     <img class="Userpic" src="./imagefolder/profile.jpeg" title="user icons" width="90">
                    <h4><span><br><%out.print(uname);%></span></h4>
                 
                     
                     </div>
                </div>
               <%
              
String ffnme="";
String emaill="";
                
                    
         List<typepac.Ticketinfogeneratebean> listt=typepac.databaseconnection.getAllreservedetails2(uname);  
        for(typepac.Ticketinfogeneratebean e:listt){  
      ffnme= e.getFlightid();
       emaill=e.getUname();
        }  
                  
        %>
               
                <div class="col-md-8">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                          <br>
                            <h6 class="text-right">EDIT</h6>
               <form action="./profileupdation" method="POST">
                        </div>
               <div class="row mt-2">
                  <label>Full Name</label><br>
                   <div class="col-md-6"><input type="text" class="form-control"  name="fullname" placeholder="Full name" value="">
                             
                            </div>
         <input type="hidden" name="uname" value="">
                            
                        </div>
                        <br>
                        <div class="row mt-3">
                            <label>Email</label><br>
                            <div class="col-md-6"><input type="text" class="form-control"   name="email" placeholder="Email" value=""></div>
                          
                        </div>
                        <br>
                      
                      
                        <div class="mt-5 text-right">
                         <button class="savechanges" type="submit">Save changes</button> </div>
                    </div>
    </form>
                </div>
            </div>
        </div>
    
    
         </div>        
                <!-----------contact us part is strat from here---------------->
           <div class="accountinfo">
               <center><h3>Contact us</h3></center>
               <hr/>
            <p>
                how we can  help you?
                <br>
                we are here get in  touch  and answer your questions
              <br/>
                  And your feedback is very important for us for improvement of our  system
            </p>
            <div class="forumofcontact">
                
               
                <div class="inserts">
                     <form action="./contactus_user" method="POST">
                         <input type="text" class="enterinfo" placeholder="Name" name="name">
                  <input type="text" class="enterinfo" placeholder="Email Address" name="email">
                  <input type="text" class="enterinfo" placeholder="Phone" name="phoneno">
                </div>
                <div class="textmessages">
                    <textarea type="textarea" placeholder="Message" name="messege"></textarea>
                  <div class="button"><input type="submit" name="submit" value="Send"></div>
                     </form>
                </div>
             
              </div>
          </div>
     
        </div>
      </div>



<script src="./js/sidebar.js"> </script>


    </body>
</html>
