package logical_Programs;

public class prime {

	public static void main(String[] args) {
		int num=10; //2,3,5,7,11..
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		
		if (count==1)
		{
			System.out.println("Given number "+num+" is  not prime number");
		}
		else
		{
			System.out.println("Given number "+num+" is prime number");
		}

	}

}
