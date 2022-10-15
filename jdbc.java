/*package stud.operate;
import stud.manage.*;
import stud.conn.*;
import stud.DB.*; */
import java.util.*;


public class jdbc{
    public static void main(String[] args) {
        int op=-1;
        Scanner sc=new Scanner(System.in);
        while(true)
        {  studmgmt st;
            boolean ans;
            System.out.println("Press 1 to Add with SID ");
            System.out.println("Press 2 to Add without SID ");
            System.out.println("Press 3 to Delete ");
            System.out.println("Press 4 to Display ");
            System.out.println("Press 5 to Exit ");
            op=sc.nextInt();

               switch(op)
            {
                case 1:
               
                  st=funs.add(1);
;
                  ans=toDB.insertDB(st,1);
                 if(ans)
                 System.out.println("Successful");
                 else
                 System.out.println("Something went wrong");
                 System.out.println(st);
                 break;
                
                 case 2:
                st=funs.add();
                 ans=toDB.insertDB(st,0);
                 if(ans)
                 System.out.println("Successful");
                 else
                 System.out.println("Something went wrong");
                 System.out.println(st);
                break;
                case 3:
                break;
                case 4:
                break;
                default:

            } 
            if(op==5)
            break;
                }
        System.out.println("Thank you for using our Application");
       
    }
}