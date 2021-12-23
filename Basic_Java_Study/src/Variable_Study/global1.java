package Variable_Study;

public class global1 extends global2 {
    int a=4;
    static int b=1;
    boolean c;
    
	public static void main(String[] args) 
	{
		System.out.println(b);
		global1 g=new global1();
		g.display();
	
		System.out.println("***********");
		display1();
				System.out.println(g.a);
				System.out.println(b);
		
	}
	public void display() 
	{
		int a=30;
		System.out.println(this.a);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void display1() 
	{
		global1 gb=new global1();
		int x=b+gb.a;
		System.out.println(x);
		//gb.a;
		System.out.println(b);
		System.out.println(gb.a);
		
	}

}
