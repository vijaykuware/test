package casting;

public class Downcasting {

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.name="Vijay";
		System.out.println(p.name);
		p.showMessage();
		System.out.println("*****************");
		Child c=(Child)p;
		c.showMessage();
		System.out.println(c.name);
		c.age=18;
		System.out.println(c.age);
		
		
		
		
	}

}
