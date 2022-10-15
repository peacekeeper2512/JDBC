import java.sql.ResultSet;



//package stud.manage;
public class studmgmt {
   
    private int sid,sage;
    private String sname;

     public studmgmt(int sid,int sage,String sname)
     {
        this.sid=sid;
        this.sage=sage;
        this.sname=sname;
        
     }

     public studmgmt(int sage,String sname)
     { 
      //this.sid=count;
        this.sage=sage;
        this.sname=sname;
        
     }

     public studmgmt()
     {
       
     }

     public int getid()
     {
        return sid;
     }

     public int getage()
     {
        return sage;
     }

     public String getname()
     {
        return sname;
     }

     public void setname(String sname)
     {
        this.sname=sname;
     }     

     public void setage(int sage)
     {
        this.sage=sage;
     }  

     public void setid(int sid)
     {
        this.sid=sid;
     } 
     
     public String toString()
     {  ResultSet rs=toDB.extractDB();
      try{  
      if(rs.next())  
      sid=rs.getInt(1);
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   
        return "Student[sid= " + sid + ", sname= " + sname + ", sage= " + sage + "]";
     }
}
