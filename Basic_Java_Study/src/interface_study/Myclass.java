package interface_study;

public abstract class Myclass implements MyInterface{

	public static void main(String[] args) {
		
//     Myclass mc=new Myclass();
//     mc.addition();
//     mc.substraction();
//     mc.multiplication();
//     mc.display();
//     mc.display1();
	}

	@Override
	public void addition() {
		int a=30;
		int sum=a+20;
		System.out.println("Sum is "+sum);
	}

	@Override
	public void substraction() {
		int a=20;
		int sub=100-a;
		System.out.println("substraction is "+sub);
		
	}

	@Override
	public void multiplication() {
	 int a=20;
	 int mul=a*5;
	 System.out.println("Multiplication is "+mul);
		
	}

	@Override
	public void display() {
		System.out.println("Dispay method from Myinterface");
		
	}
	public void display1()
	{
		System.out.println("display1 method from implementation class");
	}
	public abstract void display2();

}
