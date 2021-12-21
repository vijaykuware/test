package arrays;
import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		char[] alpha= {'a','b','c','g','e','k','l','w','z',};
		
		for(int i=0;i<=alpha.length-1;i++)
		{
			System.out.println(alpha[i]);
		
		}
		
		Arrays.sort(alpha);
		System.out.println("#########################");
		for(int i=0;i<=alpha.length-1;i++)
		{
			System.out.println(alpha[i]);
		}
		
		System.out.println("***************************");
		for(int i=alpha.length-1;i>=0;i--)
		{
			System.out.println(alpha[i]);
		}
	}

}
