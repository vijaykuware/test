package inputfromuser;
import java.util.Scanner;
public class User_Input 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name :" );
    String name=sc.next();
    System.out.println("Enter mobile No : ");
    long mob=sc.nextLong();
    System.out.println(name);
    System.out.println(mob);
}
}
