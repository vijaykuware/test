package interface_study;

public class Myclass2 extends Myclass {

	public static void main(String[] args) {
		Myclass2 m=new Myclass2();
		m.display2();
		m.display();
		m.display1();
		m.addition();
		m.substraction();
		m.multiplication();
		

	}

	@Override
	public void display2() {
		System.out.println("display method from Myclass which used for implementation for MyInterface");
		
	}

}
