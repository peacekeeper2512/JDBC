import java.util.*;
public class funs {
  static studmgmt add(int flag)
  {  Scanner sc=new Scanner(System.in);
    System.out.println("Enter ID : ");
                int id=sc.nextInt();

                System.out.println("Enter Name : ");
                sc.nextLine();
                String name=sc.nextLine();

                System.out.println("Enter Age : ");
                int age=sc.nextInt();
                 
                 studmgmt st=new studmgmt(id,age,name);

            
           return st;      
  } 
  static studmgmt add()
  {
    Scanner sc=new Scanner(System.in);

                System.out.println("Enter Name : ");
                String name=sc.nextLine();

                System.out.println("Enter Age : ");
                int age=sc.nextInt();
                 
                 studmgmt st=new studmgmt(age,name);

            
           return st;      
  }   
}
