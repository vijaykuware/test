package constructor_study;

public class CS2 {
	
	int num1;
	int num2;
	int num3;
   public CS2()   
     {
//	   //this();
//	   super();
//       
	   num1=100;
       num2=60;
    
	  }
  public CS2(int a,int b,int c) 
  {
	  num1=a;
	  num2=b;
	  num3=c;
  }
  public CS2(int a,int b)
  {
	  num1=a;
	  num2=b;
  
  }
	public static void main(String[] args) {
		
	CS2 c2=new CS2();
	c2.Addition();
	CS2 c3=new CS2();
	c3.sub();
	CS2 c4=new CS2(25, 67, 27);
	c4.mul();
	CS2 c5=new CS2(23, 42);
	c5.sub();
	CS2 c6=new CS2(12, 33, 3);
	c6.mul();
			
	
	}
		public void Addition()
		
		{
	  int a=10;int b=12;
	  int sum=a+b;
	
			System.out.println("Addition is "+sum);
			
		}
		public void sub()
		{
			int sub=num1-num2;
			System.out.println("substraction is "+sub);
		}
   public void mul()
   {
	   int mul=num1*num2*num3;
	   System.out.println("Multiplication is "+mul);
	   
   }
   }
	


