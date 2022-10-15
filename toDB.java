//package stud.DB;
//import stud.conn.*;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.*;

//import stud.manage.*;
public class toDB {
 
    public static boolean insertDB(studmgmt st,int flag)
    {  boolean f=false;

        
        try{
            //jdbc
           Connection c=CP.createC();
           PreparedStatement psmt;
           if(flag==1)
           {
            String q="insert into Students(s_id,s_name,s_age) values(?,?,?)";
           psmt=c.prepareStatement(q);
           //set value of params
           psmt.setInt(1, st.getid());
           psmt.setString(2, st.getname());
           psmt.setInt(3, st.getage());
           }
           else{
            ResultSet rs=extractDB();
            int sid=-1;
            if(rs.next())
            sid=rs.getInt(1);
            String q="alter table students auto_increment=?";
            psmt=c.prepareStatement(q);
            psmt.setInt(1, sid);
            psmt.executeUpdate();
            
            q="insert into Students(s_name,s_age) values(?,?)";
           psmt=c.prepareStatement(q);
           //set value of params
           psmt.setString(1, st.getname());
           psmt.setInt(2, st.getage());
           }
           //execute
           psmt.executeUpdate();
           f=true;

        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return f;
    }

    public static ResultSet extractDB()
    {  
        ResultSet rs=null;
        
        try{
            //jdbc
           Connection c=CP.createC();
           Statement psmt;
          
           String q="select max(s_id) from Students";
           psmt=c.createStatement();
           //extract
           rs=psmt.executeQuery(q);
        
        
           
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
        return rs;
    }
}
