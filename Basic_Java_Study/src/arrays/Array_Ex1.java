package arrays;

import java.util.Arrays;

public class Array_Ex1 {

	public static void main(String[] args) {
		String name[]=new String[5];
		name[0]="Vijay";
		name[1]="Ajay";
		name[2]="Ramesh";
		name[3]="Suresh";
		name[4]="Sachin";
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
			
		}
		Arrays.sort(name);
		System.out.println("******************************");
		System.out.println("Accending order of Array");
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("******************************");
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
		
		
	}

}
