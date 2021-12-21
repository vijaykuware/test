package arrays;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) 
	{
		int[] a= {10,23,44,45,654,33,32};
		
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("***********************************");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("***********************************");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		

	}

}
