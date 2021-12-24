package Variable_Study;

public class GlobalVariable {
      int a=20;            
	  static int b=50;     
	  String Name="Vijay";
	  static String city="Pune";
	  public static void main(String[] args) {
	   
    GlobalVariable g=new GlobalVariable();
    g.Display();
    Display1();
    
	   }

	public void Display()
	{
		int sum=a+15;  
		System.out.println("Addition is "+sum);
	    int mul=a*b*24;     
	    System.out.println("Multiplication is "+mul);
	    System.out.println("Name is: "+Name);
	    System.out.println("City is: "+city);
	}
	
	public static void Display1()
	{
	    GlobalVariable m=new GlobalVariable();// create new object
	    System.out.println(m.a);
		
	    int d=10+m.a;   // using new object for calling non static variable in static method.
	    System.out.println(b);
	    System.out.println("Name is "+m.Name);
		System.out.println("City is: "+city);
		System.out.println("d is"+d);
		
		
	}
	
}
