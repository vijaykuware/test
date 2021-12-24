package arrays;


//anonymous array do not have name.
//created and initialized in single line.
//it can be single or multidimensional array.
//it can be used only once.
//it can be used an arguments in method.


public class AnonymousArray {

	public static void main(String[] args)
	{
		AnonymousArray.sum(new int [] {10,20,30});//created and initialized in single line.
		
	}	
	
		static void  sum(int[] no)//it can be used an arguments in method.it can be used only once.
		{
			int total=0;
			for(int i:no)
			{
				total=total+i;
			}
			System.out.println("sum is "+total);
		}
		
		
	}


