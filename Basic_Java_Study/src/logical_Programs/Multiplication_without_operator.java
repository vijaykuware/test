package logical_Programs;

import java.util.Scanner;

public class Multiplication_without_operator {

	public static void main(String[] args) {
//		int a=4;
//		int b=6;
//		int mul=0;
//		
//		for(int i=1;i<=6;i++)
//		{
//			mul=mul+a;
//		}
//		System.out.println(mul);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a ");
		int a=sc.nextInt();
		System.out.println("enter number b");
		int b=sc.nextInt();
		
		int mul=0;
		
		for(int i=1;i<=b;i++)
		{
			mul=mul+a;
		}
		System.out.println("Multiplication is "+mul);
		

	}

}
