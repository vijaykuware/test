package Basics;

public class Method_Study
              { 

		public static void main(String[] args) 
		
		{
				
		System.out.println("hi i am main method");
		myMethod();//static method call from same class
		Sample4.Addition();
		Sample4 s5= new Sample4();
		s5.mul(12, 12, 14);
		s5.sub();//static method call from another/diff class
		//Method name --> to call static regular method form same class
		//classname.methodname-->to call static regular method form another class
		
		}

		
		public static void myMethod() // method with body is called as method definition
		{
			
			System.out.println("hi I am static method");
			
		}
		
		
		
	}

