package casting;

public class Implicit_Explicit_Casting {

	public static void main(String[] args) {
		Implicit_Explicit_Casting ex=new Implicit_Explicit_Casting();
		ex.implicit_Casting();
		ex.explicit_Casting();

	}
	public void implicit_Casting()
	{
		int a=5;
		System.out.println(a);
		double b=a;
		System.out.println(b);
		byte e=127;
		System.out.println(e);
		float f=(byte) e;
		System.out.println(f);
		
	}
	public void explicit_Casting()
	{
		double c=10.7;
		System.out.println(c);
		int d=(int) c;
		System.out.println(d);
		float g=129;
		System.out.println(g);
		byte h=(byte)g;
		System.out.println(h);
		
	}

}
