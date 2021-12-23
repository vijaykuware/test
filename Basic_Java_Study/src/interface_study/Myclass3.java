package interface_study;

public class Myclass3 implements MyInterface2 {

	public static void main(String[] args) {
		
     Myclass3 mc3=new Myclass3();
     mc3.addition();
     mc3.substraction();
     mc3.multiplication();
     mc3.display();
	}

	@Override
	public void addition() {
		int a=35;
		int sum=a+20;
		System.out.println("Sum is "+sum);
	}

	@Override
	public void substraction() {
		int a=25;
		int sub=100-a;
		System.out.println("substraction is "+sub);
		
		
	}

	@Override
	public void multiplication() {
		 int a=20;
		 int mul=a*55;
		 System.out.println("Multiplication is "+mul);
			
		
	}

	@Override
	public void display() {
		System.out.println("Dispay method from Myinterface2");
		
		
	}

}
