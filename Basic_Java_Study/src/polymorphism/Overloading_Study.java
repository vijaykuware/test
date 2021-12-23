package polymorphism;

public class Overloading_Study
{

	public static void main(String[] args) 
	{
	

	}
	public void Addition()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	public void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	public void Addition(int a,int b,int c)
	{
		int sum =a+b+c;
		System.out.println("Addition is "+sum);
	}

}
