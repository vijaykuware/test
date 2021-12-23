package ThisSuperUse;

public class Super_Use {
    int a=100;
   
	public static void main(String[] args) {
	int b=30;
    Super_Use s=new Super_Use();
    s.substraction();
	System.out.println(b);
	
	}
    public void substraction()
    {
    	int sub=1000-a;
    	System.out.println("Substraction is "+sub);
    	
    
    }
}
