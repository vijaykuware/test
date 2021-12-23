package ThisSuperUse;

public class This_Use extends Super_Use {
	int a=10;
	
	public static void main(String[] args) {

    This_Use t=new This_Use();
    t.addition();

    t.substraction();
    
    }
	public void addition()
	{
		int a=20;
		int sum=a+30;
		System.out.println("Addition is "+sum);
		sum=this.a+70+super.a;
		System.out.println("Addition is "+sum);
		System.out.println("Global variable from Super_Use class "+super.a);
	}
	

}
