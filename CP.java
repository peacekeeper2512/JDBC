//package stud.conn;
import java.sql.Connection;
import java.sql.DriverManager; 
public class CP {
    static Connection c;
    public static Connection createC()
    {
        try{
            //load
       Class.forName("com.mysql.cj.jdbc.Driver");

       //create
       String user="root";
       String pass="Sourav@6699";
       String url="jdbc:mysql://localhost:3306/sourav";
         c=DriverManager.getConnection(url, user, pass);
         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return c;
    }
    
}
