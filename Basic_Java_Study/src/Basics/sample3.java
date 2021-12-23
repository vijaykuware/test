package Basics;

public class sample3 {

	public static void main(String[] args) {
		System.out.println("Running main method");
		addition();//calling static method from same class
		sample3 s3=  new sample3();// creating object of class
		s3.sub();// calling non static method from same class
		s3.mul(10, 9);// calling non-static methods with parameters
		s3.mul(20, 3);
		
		sample3 t3= new sample3();// creating another object in same class-->dont create multiple object if not necessary. 
		t3.mul(59, 10);// calling mul using new object t3
		
		mul(10, 20, 8);// calling static method with 3 parameters.
		mul(11,12,13);
	
	} 

	public static void addition()  // creating static method without parameter
	{
		int a=10;// 1.2 variable initialization and declaration
		int b=20;
		int sum=a+b;
		System.out.println("Addition of two numbers is "+sum);
		
	}
	
	public void sub() // creating non-static method without parameter
	{
		int a=10;
		int b=30;
		int subs=b-a;
		System.out.println("Substration of two numbers is "+subs);
	}
	
	public void mul(int a, int b)// non-static with parameters//10, 7
	{
		int multiplication=a*b;
		System.out.println("Multiplication of two numbers is "+multiplication);
	}
	
	public static void mul(int a, int b, int c)// static with parameters//10, 7
	{
		int multiplication=a*b*c;
		System.out.println("Multiplication of two numbers is "+multiplication);
	}

	 
}


