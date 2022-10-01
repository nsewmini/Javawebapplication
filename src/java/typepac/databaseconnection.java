/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typepac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class databaseconnection {
     public static Connection createConnection(){  
        Connection con=null;  
        try{  
Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenix_airline_db", "root", "");
        
        }catch(ClassNotFoundException | SQLException e){System.out.println(e);}  
        return con;  
    }  
    
     
     
    public boolean sendMsg(String name,String email,String phoneno,String messege) throws ClassNotFoundException,SQLException
    {
    PreparedStatement ps = createConnection().prepareStatement("insert into contactmsg values(?,?,?,?)");
    ps.setString(1,name);
    ps.setString(2,email);
    ps.setString(3,phoneno);
    ps.setString(4,messege);
    int i= ps.executeUpdate();
    
    if((i>0))
        return true;
    else
        return false;
    }
    
    
    
    
     public boolean ticketIDgen(String ticketid,String flightid,String uname) throws ClassNotFoundException,SQLException
    {
    PreparedStatement ps = createConnection().prepareStatement("insert into ticketdetails (ticketid,flightid,uname) values(?,?,?)");
    ps.setString(1,ticketid);
    ps.setString(2,flightid);
    ps.setString(3,uname);
    int i= ps.executeUpdate();

    if((i>0))
        return true;
    else
        return false;
    }
     
     public static List<flightinformationbean> getAllflightinfo(){  
        List<flightinformationbean> list=new ArrayList<flightinformationbean>();  
          
        try{  
            Connection con=databaseconnection.createConnection();  
            PreparedStatement ps=con.prepareStatement("select * from flightsinformations");  
      
            ResultSet rs=ps.executeQuery();  
       
            while(rs.next()){  
                flightinformationbean e=new flightinformationbean();  
                e.setFlightid(rs.getString(1));  
                e.setFlightfrom(rs.getString(2));  
                e.setFlightto(rs.getString(3));  
                e.setDepartdate(rs.getString(4));  
                e.setReturndate(rs.getString(5));  
                e.setTime(rs.getString(6));  
       
                list.add(e);  
            }  
            con.close();  
        }catch(SQLException e){e.printStackTrace();}  
          
        return list;  
    }
    
     
     
    public static List<userbean_contactusform > getAllusercontactMsg(){  
        List<userbean_contactusform > list=new ArrayList<userbean_contactusform >();  
          
        try{  
            Connection con=databaseconnection.createConnection();  
            PreparedStatement ps=con.prepareStatement("select * from contactmsg");  
      
            ResultSet rs=ps.executeQuery();  
       
            while(rs.next()){  
              userbean_contactusform   e=new userbean_contactusform  ();  
                e.setName(rs.getString(1));  
                e.setEmail(rs.getString(2));  
                e.setPhoneno(rs.getString(3));  
                e.setMessege(rs.getString(4));  
            
       
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
    public static List<Ticketinfogeneratebean> getAllticketdetails(){  
        List<Ticketinfogeneratebean> list=new ArrayList<Ticketinfogeneratebean>();  
          
        try{  
            Connection con=databaseconnection.createConnection();  
            PreparedStatement ps=con.prepareStatement("select * from ticketdetails");  
      
            ResultSet rs=ps.executeQuery();  
       
            while(rs.next()){  
                Ticketinfogeneratebean e=new Ticketinfogeneratebean();  
                e.setTicketid(rs.getString(1));  
                e.setFlightid(rs.getString(2));  
                e.setUname(rs.getString(3));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
   public static List<Ticketinfogeneratebean> getAllreservedetails(String uname){  
        List<Ticketinfogeneratebean> list=new ArrayList<Ticketinfogeneratebean>();  
        try{  
            Connection con=databaseconnection.createConnection();  
            PreparedStatement ps=con.prepareStatement("select * from ticketdetails where uname=? ");  
          
            ps.setString(1,uname);
        
            ResultSet rs=ps.executeQuery();  
     
            while(rs.next()){  
               Ticketinfogeneratebean e=new Ticketinfogeneratebean();  
                e.setTicketid(rs.getString(1));  
                e.setFlightid(rs.getString(2));  
                e.setUname(rs.getString(3));  
               
       
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
    
public static List<Ticketinfogeneratebean> getAllreservedetails2(String uname){  
        List<Ticketinfogeneratebean> list=new ArrayList<Ticketinfogeneratebean>();  
        try{  
            Connection con=databaseconnection.createConnection();  
            PreparedStatement ps=con.prepareStatement("select * from userdetails where uname=?");  
          
            ps.setString(1,uname);
        
            ResultSet rs=ps.executeQuery();  
     
            while(rs.next()){  
               Ticketinfogeneratebean e=new Ticketinfogeneratebean();  
                e.setTicketid(rs.getString(1));  
                e.setFlightid(rs.getString(2));  
                e.setUname(rs.getString(3));  
               
       
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    } 

    
}
