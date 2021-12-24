package AccessSpecifier;


public class studySpecifier {

	public static void main(String[] args) 
	{
	studySpecifier s=new studySpecifier();
	s.display();
	System.out.println("**************");
	s.display1();
	System.out.println("**************");
	s.display2();
	System.out.println("**************");
	s.display3();

	}
	private void display()
	{
		System.out.println("private method");
	}
	void display1()
	{
		System.out.println("default method");
	}
	public void display2()
	{
		System.out.println("public method");
	}
	protected void display3()
	{
		System.out.println("protected method");
	}
	

}
