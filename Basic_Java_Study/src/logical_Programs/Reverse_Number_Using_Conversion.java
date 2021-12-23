package logical_Programs;

public class Reverse_Number_Using_Conversion {

	public static void main(String[] args) {
		int a=12345;
		String rev = Integer.toString(a);
		String revnum ="";
		
		for(int i=rev.length()-1;i>=0;i--)
		{
			revnum=revnum+rev.charAt(i);
		}
		int revint=Integer.parseInt(revnum);
		System.out.println(revint);

	}

}
