package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;
import typepac.databaseconnection;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public final class UserDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>user dashboard</title>\n");
      out.write(" \n");
      out.write("<!-- swiper css link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\n");
      out.write("\n");
      out.write("   <!-- font awesome cdn link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("\n");
      out.write("   <!-- Bootstrap -->\n");
      out.write("   <link type=\"text/css\" rel=\"stylesheet\" href=\"./Cssfolder/css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("   <!-- custom css file link  -->\n");
      out.write("   <link rel=\"stylesheet\" href=\"./Cssfolder/userdashboardstyle.css\">\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!--------header section- here ------>\n");
      out.write("    <!---------------------- start point of the header section  ---------------------->\n");
      out.write("    <section class=\"header\">\n");
      out.write(" \n");
      out.write("        <div class=\"logo\">\n");
      out.write("      <a>  <img src=\"./imagefolder/logo01.jpeg\" style=\"height: 89px; width: 150px; transition: .5s;\"></a>\n");
      out.write("     </div>\n");
      out.write("       \n");
      out.write("          <nav class=\"navbar\">\n");
      out.write("            <a href=\"#\"  class=\"active01\">Home</a> \n");
      out.write("              <a href=\"#\">Book a flight</a>\n");
      out.write("              <a href=\"#\">Flight Status</a>\n");
      out.write("              <a href=\"#\">Profile</a>\n");
      out.write("               <a href=\"#\" class=\"signout-btn\" style=\"color: rgb(205, 100, 100);\">Sign Out</a>\n");
      out.write("       \n");
      out.write("        </nav>\n");
      out.write("     \n");
      out.write("        <div id=\"sidebar\" class=\"fas fa-bars\">\n");
      out.write("<style>\n");
      out.write("          #sidebar{\n");
      out.write("            font-size: 2.5rem;\n");
      out.write("            cursor: pointer;\n");
      out.write("            color:var(--black);\n");
      out.write("            display: none;\n");
      out.write("            float:right;\n");
      out.write("         }</style>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("     </section>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      <!-----------end of the header--------->\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write(" \n");
      out.write("       <!---------dashboard body part start from here-------------->\n");
      out.write("        \n");
      out.write("         <section id=\"dashboard\">\n");
      out.write("            <div class=\"info01\">\n");
      out.write("             <center> <h1 class=\"info02\">   <b>Phoenix-Airline </b></h1></center>\n");
      out.write("                <center><h2 class=\"info03\"> User Dashboard </h2></center>\n");
      out.write("                \n");
      out.write("                <style> \n");
      out.write("                 .info01 {\n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("                    position: relative;\n");
      out.write("                    animation-name: mymove;\n");
      out.write("                    animation-duration: 5s;\n");
      out.write("                   \n");
      out.write("                    text-shadow: 2px 2px 8px #697fc7;\n");
      out.write("                  }\n");
      out.write("                  \n");
      out.write("                  @keyframes mymove {\n");
      out.write("                    from {right: -5px;}\n");
      out.write("                    to {right:450px;}\n");
      out.write("                  }\n");
      out.write("                  </style>\n");
      out.write("         </div>\n");
      out.write("         </section>\n");
      out.write("     <!----------------sidfebar here---------------->\n");
      out.write("         <div class=\"bar01\">\n");
      out.write("            <div class=\"bar02\">\n");
      out.write("              <div class=\"bar03\">Manage  your ticket booking information</div>\n");
      out.write("              <br/> <br/> <br/>\n");
      out.write("              <div class=\"bar04\">\n");
      out.write("                Account Settings</div>\n");
      out.write("                <br> <br> <br>\n");
      out.write("              <div class=\"bar04\">\n");
      out.write("               Contact us</div>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("    <!-----------------the manage your tickect information description is here ---------->\n");
      out.write("            <div class=\"manageinfo\" >\n");
      out.write("              <div class=\"description\">\n");
      out.write("                <br>\n");
      out.write("               <center><h3><b>Manage  your ticket booking information</b></h3></center>\n");
      out.write("               <hr />\n");
      out.write("                   <center> <p>\n");
      out.write("                        Make it easier and more efficient to manage your ticket booking \n");
      out.write("                        information with Phoenix Airlines.\n");
      out.write("                       <br> \n");
      out.write("                    Additionally, update details and track relevant travel times\n");
      out.write("                     </p>\n");
      out.write("                   </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("                <table class=\"tableinfo\">\n");
      out.write("                    <thead>\n");
      out.write("                       <tr>\n");
      out.write("                           \n");
      out.write("                         <th>Ticket ID</th>\n");
      out.write("                         <th>Flight ID</th>\n");
      out.write("                         <th>User Name</th>\n");
      out.write("                         \n");
      out.write("                       </tr>\n");
      out.write("                     </thead>\n");
      out.write("                     <tbody>\n");
      out.write("                    \n");
      out.write("                         \n");
      out.write("                       <!--------jsp code here---------> \n");
      out.write("                         ");

              
                
                    
      List<typepac.Ticketinfogeneratebean> list=typepac.databaseconnection.getAllreservedetails(uname);  
      for(typepac.Ticketinfogeneratebean e:list){  
      out.print("<tr><td>"+"&nbsp "+e.getTicketid()+"</td><td>"+"&nbsp"+e.getFlightid()+"</td><td>"+"&nbsp "+e.getUname()+"</td>  </tr>");  
      }  
                  
        
      out.write("\n");
      out.write("                     </tbody>\n");
      out.write("                   </table>\n");
      out.write("                   </center>\n");
      out.write("        \n");
      out.write("           </div>\n");
      out.write("                     <!---------the account setting part here--------> \n");
      out.write("             <div class=\"accountinfo\">\n");
      out.write("                 <center> <h3>Account Settings</h3></center>\n");
      out.write("                 <hr/>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("          \n");
      out.write("      \n");
      out.write("                   <br>\n");
      out.write("                   <div class=\"container rounded bg-white mt-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 border-right\">\n");
      out.write("                     <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\">\n");
      out.write("                     <img class=\"Userpic\" src=\"./imagefolder/profile.jpeg\" title=\"user icons\" width=\"90\">\n");
      out.write("                    <h4><span><br>");
out.print(uname);
      out.write("</span></h4>\n");
      out.write("                 \n");
      out.write("                     \n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("               ");

              
String ffnme="";
String emaill="";
                
                    
         List<typepac.Ticketinfogeneratebean> listt=typepac.databaseconnection.getAllreservedetails2(uname);  
        for(typepac.Ticketinfogeneratebean e:listt){  
      ffnme= e.getFlightid();
       emaill=e.getUname();
        }  
                  
        
      out.write("\n");
      out.write("               \n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"p-3 py-5\">\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                          <br>\n");
      out.write("                            <h6 class=\"text-right\">EDIT</h6>\n");
      out.write("               <form action=\"./profileupdation\" method=\"POST\">\n");
      out.write("                        </div>\n");
      out.write("               <div class=\"row mt-2\">\n");
      out.write("                  <label>Full Name</label><br>\n");
      out.write("                   <div class=\"col-md-6\"><input type=\"text\" class=\"form-control\"  name=\"fullname\" placeholder=\"Full name\" value=\"\">\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("         <input type=\"hidden\" name=\"uname\" value=\"\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row mt-3\">\n");
      out.write("                            <label>Email</label><br>\n");
      out.write("                            <div class=\"col-md-6\"><input type=\"text\" class=\"form-control\"   name=\"email\" placeholder=\"Email\" value=\"\"></div>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                        <div class=\"mt-5 text-right\">\n");
      out.write("                         <button class=\"savechanges\" type=\"submit\">Save changes</button> </div>\n");
      out.write("                    </div>\n");
      out.write("    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("         </div>        \n");
      out.write("                <!-----------contact us part is strat from here---------------->\n");
      out.write("           <div class=\"accountinfo\">\n");
      out.write("               <center><h3>Contact us</h3></center>\n");
      out.write("               <hr/>\n");
      out.write("            <p>\n");
      out.write("                how we can  help you?\n");
      out.write("                <br>\n");
      out.write("                we are here get in  touch  and answer your questions\n");
      out.write("              <br/>\n");
      out.write("                  And your feedback is very important for us for improvement of our  system\n");
      out.write("            </p>\n");
      out.write("            <div class=\"forumofcontact\">\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <div class=\"inserts\">\n");
      out.write("                     <form action=\"./contactus_user\" method=\"POST\">\n");
      out.write("                         <input type=\"text\" class=\"enterinfo\" placeholder=\"Name\" name=\"name\">\n");
      out.write("                  <input type=\"text\" class=\"enterinfo\" placeholder=\"Email Address\" name=\"email\">\n");
      out.write("                  <input type=\"text\" class=\"enterinfo\" placeholder=\"Phone\" name=\"phoneno\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"textmessages\">\n");
      out.write("                    <textarea type=\"textarea\" placeholder=\"Message\" name=\"messege\"></textarea>\n");
      out.write("                  <div class=\"button\"><input type=\"submit\" name=\"submit\" value=\"Send\"></div>\n");
      out.write("                     </form>\n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"./js/sidebar.js\"> </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
