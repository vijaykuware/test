package polymorphism;

public class Xyz extends Test
{
	public void show()
	{
		System.out.println(2);
	}

	public static void main(String[] args)
	{
	Test t=new Test();
	t.show();
	Xyz x=new Xyz();
	x.show();
     
	}

}
