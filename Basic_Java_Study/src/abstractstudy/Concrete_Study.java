package abstractstudy;

public class Concrete_Study extends Abstract_Study{

	@Override
	public void multiplication() {
		int a=23;
		int mul=a*2;
		System.out.println("Multiplication is "+mul);
		
		
	}
   public static void main(String[] args) {
	Concrete_Study c=new Concrete_Study();
	c.addition();
	c.multiplication();
	c.display();
}
@Override
public void display() {
	System.out.println("Abstract use ");
	
}
}
