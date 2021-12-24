package string;

public class Reverse_String {

	public static void main(String[] args)    

	{
		String s=new String("malayalam");
		String s1="";
		
		System.out.println(s.length());
		
		for(int i=s.length()-1; i>=0; i--)
		{
			s1=s1+s.charAt(i);
			System.out.println(s1);
			
		}
		System.out.println("String is "+s);
		System.out.println("Reverse String is "+s1);
		
		if(s.equals(s1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
		System.out.println("String is not Palindrome");	
		}
		
	
	}	

	}

	
