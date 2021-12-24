package Basics;

public class Sample4 {
   static int num=10;
	public static void main(String[] args) {
	   Addition();
	   Sample4 s4= new Sample4();
	   s4.sub();
	   s4.mul(12,23,34);
	}
		public static void Addition()
		{
			

			int a=10;
			int b=20;
			int add=a+b;
			System.out.println("Addition is "+add);
		}
      
		public void sub()
       {
    	  int a=10;
    	  int b=20;
    	  int subs=b-a;
    	  System.out.println("Substraction is "+subs);
       }
		public void mul(int a, int b, int c)
		{
			int mul=a*b*c;
			System.out.println("Multiplication is "+mul);
		}
	}


