package logical_Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s1="RADAR";
		String reverse="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println("original string is "+s1);
		System.out.println("Reverse string is "+reverse);
		
		if(s1.equals(reverse))
		{
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
